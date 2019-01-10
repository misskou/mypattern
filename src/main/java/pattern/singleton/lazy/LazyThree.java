package pattern.singleton.lazy;

/**
 * 兼顾线程安全和效率的写法
 */
public class LazyThree {
    private static LazyThree lazyThree = null;
    private LazyThree(){};
    public static LazyThree getLazyThree(){
        //双重检查锁
        //在单例中new的情况非常少，绝大多数都是可以并行的读操作。
        //因此在加锁前多进行一次null检查就可以减少绝大多数的加锁操作，执行效率提高的目的也就达到了
        if(lazyThree == null){
            synchronized (LazyThree.class){
                if(lazyThree == null){
                    lazyThree = new LazyThree();
                }
            }
        }
        return lazyThree;
    }
}
