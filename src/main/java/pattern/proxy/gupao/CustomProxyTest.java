package pattern.proxy.gupao;

public class CustomProxyTest {
    public static void main(String[] args) {

        Person obj = (Person) new CustomMeiPo().getInstance(new XieMu());

        System.out.println(obj.getClass());

        obj.findLove();
    }
}
