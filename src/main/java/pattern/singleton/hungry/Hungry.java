package pattern.singleton.hungry;


//饿汉式：类加载时就完成了初始化，避免了多线程安全问题。
//问题：浪费内存，可能占着茅坑不拉屎
public class Hungry {

    private  static Hungry hungry = new Hungry();
    private Hungry(){

    };
    public static Hungry getHungry(){
        return hungry;
    }
}
