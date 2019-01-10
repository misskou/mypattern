package pattern.singleton.enums;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.sql.SQLOutput;

public class EnumSingletonTest {
    public static void main(String[] args) throws Exception {
        System.out.println(MyenumSingleton.Instance.doSomething());

        //枚举类型的单例防止通过构造器的方式实例化

        //使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象。
        /*Class<MyenumSingleton> aClass = MyenumSingleton.class;
        Constructor<MyenumSingleton> c = aClass.getDeclaredConstructor(null);
        MyenumSingleton myenumSingleton = c.newInstance();
        System.out.println(myenumSingleton);*/

        try{
            MyenumSingleton sing = MyenumSingleton.getInstance();
            System.out.println(sing);
            FileOutputStream  fos = new FileOutputStream("MyenumSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(sing.hashCode());
            os.flush();
            os.close();


            FileInputStream fis = new FileInputStream("MyenumSingleton.obj");
            ObjectInputStream is = new ObjectInputStream(fis);
            MyenumSingleton o = (MyenumSingleton) is.readObject();

            System.out.println(o.hashCode());

            is.close();
            System.out.println(sing == o);
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }


    }
}
