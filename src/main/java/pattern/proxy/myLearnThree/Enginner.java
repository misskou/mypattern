package pattern.proxy.myLearnThree;

/**
 * 需要代理的类
 */
public class Enginner {

    public void eat(){
        System.out.println("正在吃饭");
    }

    public final void work(){
        System.out.println("正在工作：final修饰");
    }

    private void play(){
        System.out.println("正在玩耍：private修饰");
    }
}
