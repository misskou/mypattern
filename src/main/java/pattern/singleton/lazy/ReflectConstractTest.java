package pattern.singleton.lazy;

import java.lang.reflect.Constructor;


public class ReflectConstractTest {
    public static void main(String[] args) {
        try{
            /*
        Class<LazyThree> threeClass = LazyThree.class;
        //通过反射拿到私有构造方法
        Constructor<LazyThree> c = threeClass.getDeclaredConstructor();
        //* 强制访问，不愿意也要强吻 *//*
        c.setAccessible(true);
        //暴力初始化
        LazyThree One = c.newInstance();

        System.out.println(One);

        //调用两次构造方法，相当于new了2次，犯了原则性问题
        LazyThree two = c.newInstance();
        System.out.println(two);

        System.out.println(One == two);
        */


        //InnerClass 构造器添加了synchronized
        Class<InnerClass> ic = InnerClass.class;
        //通过反射拿到私有构造方法
        Constructor<InnerClass> constructor = ic.getDeclaredConstructor(null);
        //* 强制访问，不愿意也要强吻 *//*
        constructor.setAccessible(true);
        //暴力初始化
        InnerClass innerone = (InnerClass)constructor.newInstance();

        //System.out.println(innerone);

        //调用两次构造方法，相当于new了2次，犯了原则性问题
        InnerClass innertwo = InnerClass.getInstance();
        //System.out.println(innertwo);

        System.out.println(innerone == innertwo);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
