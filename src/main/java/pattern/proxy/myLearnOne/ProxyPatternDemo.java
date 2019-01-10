package pattern.proxy.myLearnOne;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //刚开始时，需要创建RealImage对象
        image.display();

        System.out.println("-------");

        //再次调用，不再需要创建RealImage对象
        image.display();
    }
}
