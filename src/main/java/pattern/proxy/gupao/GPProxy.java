package pattern.proxy.gupao;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GPProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader gpClassLoader,Class<?>[] interfaces,GPInvocationHandler h){

        try {
            //1.动态生成源代码.java文件classPath
            String src = generateSrc(interfaces);

            //2.java文件输出到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            System.out.println("java文件输出到磁盘 " + filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3.把java文件编译成class文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> fileObjects = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, manager, null, null, null, fileObjects);
            task.call();
            manager.close();

            //4.将编译生成的class文件加载到jvm中
            Class<?> proxyClass = gpClassLoader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();

            //5.返回字节码重组以后的新的代理对象
            return constructor.newInstance(h);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    private static String generateSrc(Class<?> [] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package pattern.proxy.gupao;"+ ln);
        sb.append("import pattern.proxy.gupao.Person;" +ln);
        sb.append("import java.lang.reflect.Method;" +ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName() +" { " +ln);
            sb.append("private GPInvocationHandler h;"+ln);
            sb.append("public $Proxy0(GPInvocationHandler h){ "+ln);
            sb.append("this.h = h; "+ln);
            sb.append("}"+ln);
        for(Method m : interfaces[0].getMethods()){
            sb.append("public "+m.getReturnType().getName() + " " + m.getName()+ "(){" +ln);
                sb.append("try{" +ln);
                    sb.append("Method m = "+interfaces[0].getName() + ".class.getMethod(\""+m.getName()+"\",new Class[]{ });" +ln);
                    sb.append("this.h.invoke(this,m,null);" +ln);
                sb.append("}catch(Throwable e){" +ln);
                sb.append("e.printStackTrace();" +ln);
                sb.append("}"+ln);
            sb.append("}"+ln);
        }

        sb.append("}");
        return  sb.toString();
    }

}
