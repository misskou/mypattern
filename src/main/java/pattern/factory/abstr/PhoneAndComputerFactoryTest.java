package pattern.factory.abstr;

/**
 * 使用工厂模式时，只需要关心降低耦合度的目的是否达到了
 * 工厂方法模式：
 * 一个抽象产品类，可以派生出多个具体产品类。   
 * 一个抽象工厂类，可以派生出多个具体工厂类。   
 * 每个具体工厂类只能创建一个具体产品类的实例。
 * 抽象工厂模式：
 * 多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
 * 一个抽象工厂类，可以派生出多个具体工厂类。   
 * 每个具体工厂类可以创建多个具体产品类的实例。
   区别：
   工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。
   工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
 */
public class PhoneAndComputerFactoryTest {
    public static void main(String[] args) {
        //一个抽象工厂类，可以派生出多个具体工厂类。
        DomesticCreate domesticCreate = new DomesticCreate();
        System.out.println(domesticCreate.createPhone());

        AbroadCreate abroadCreate = new AbroadCreate();
        System.out.println(abroadCreate.createComputer());
    }
}
