package pattern.proxy.gupao;

import java.io.*;

public class GPClassLoader extends ClassLoader {
    private File classPathFile;

    public  GPClassLoader(){
        String classPath = GPClassLoader.class.getResource("").getPath();
        System.out.println("classPath: "+classPath);
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GPClassLoader.class.getPackage().getName()+"."+name;
        System.out.println("className: "+className);
        if(classPathFile != null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") +".class");
            FileInputStream fis = null;
            ByteArrayOutputStream bos = null;
            if(classFile.exists()){
                try {
                    fis = new FileInputStream(classFile);
                    bos = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while((len = fis.read(buff)) > -1){
                        bos.write(buff,0,len);
                    }

                    return defineClass(className,bos.toByteArray(),0,bos.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if(null != fis){
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    if(null != bos){
                        try {
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }

        return null;
    }
}
