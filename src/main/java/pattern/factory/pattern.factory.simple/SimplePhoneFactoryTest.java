package pattern.factory.simple;
import pattern.factory.basic.Phone;
import pattern.factory.basic.Apple;
import pattern.factory.simple.SimplePhoneFactory;

public class SimplePhoneFactoryTest {
    public static void main(String[] args) {

        //一般创建对象模式:用户参与到生产手机的过程中去
        Apple app = new Apple();
        System.out.println(app.getName());

        //简单工厂模式：用户不在关心生产的过程，只需要关注这个结果就行了
        SimplePhoneFactory factory = new SimplePhoneFactory();
        Phone sanxing = factory.getPhone("三星");
        System.out.println(sanxing.getName());
    }
}
