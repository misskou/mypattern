package pattern.singleton.lazy;

public class LazyTwo {
    private static volatile LazyTwo lazyTwo = null;
    private LazyTwo(){};
    public static LazyTwo getLazyTwo(){
        synchronized (LazyTwo.class){
            if(lazyTwo == null){
                lazyTwo = new LazyTwo();
            }
        }
        return lazyTwo;
    }
}
