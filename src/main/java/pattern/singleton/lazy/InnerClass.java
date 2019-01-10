package pattern.singleton.lazy;
//此包下共同的缺点：
//1.都需要额外的工作(Serializable、transient、readResolve())来实现序列化，
// 否则每次反序列化一个序列化的对象实例时都会创建一个新的实例。
//2.可能会有人使用反射强行调用我们的私有构造器
// （如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）


import java.io.Serializable;

//保证单例模式最好的方式：采用内部类的方法
//why:既保证了节约内存：只有外部类被调用使用的时候，内部类才会被加载。
//    又避免了线程安全问题，兼顾了synchronized的性能问题
public class InnerClass  implements Serializable {
    //此处变量必须声明为static
    private static boolean initialized = false;

    /*
      static：使单例空间共享
      final:保证此方法不会被重写，重载
     */
    protected  static final InnerClass getInstance(){
        return Holder.innerClass;
    }

    //默认使用InnerClass的时候，会先初始化内部类
    //如果没有使用，内部类是不会加载的
    //单例模式必须将构造器声明为private
    //synchronized保证了使用反射强行调用我们的私有构造器
    // （如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）
    private InnerClass(){
        synchronized (InnerClass.class){
            if(!initialized){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例模式被侵犯了");
            }
        }
    };

    private static  class Holder{
        private static InnerClass innerClass = new InnerClass();
    }


    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new


    //实现此方法可以保证在反序列化的时候，内存中的对象只有一份

    //当JVM从内存中反序列化地"组装"一个新对象时，就会自动调用这个 readResolve方法来返回我们指定好的对象了，单例规则也就得到了保证
    private Object readResolve(){
        return Holder.innerClass;
    }

}
