package pattern.singleton.lazy;
/*
  单线程的写法：懒汉式
  实现延时加载
 */
public class LazyOne {
    private static LazyOne lazyOne = null;
    private LazyOne(){};
    public static LazyOne getSingleton(){
        if(lazyOne == null)
            lazyOne = new LazyOne();

        return lazyOne;
    }
}
