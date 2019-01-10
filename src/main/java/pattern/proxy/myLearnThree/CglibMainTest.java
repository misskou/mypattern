package pattern.proxy.myLearnThree;

public class CglibMainTest {

    public static void main(String[] args) {
        //生产cglib代理类
        Enginner enginner  = (Enginner) CglibProxy.getProxy(new Enginner());

        //调用相关方法
        enginner.eat();

    }
}
