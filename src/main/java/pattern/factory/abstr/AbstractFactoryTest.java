package pattern.factory.abstr;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        //对用户而言更加简单了，用户只有选择的权利，保证程序的健壮性
        //如果新增加产品保证了不影响原来的功能：开闭原则--扩展开放，修改关闭
        System.out.println(pf.getXiaoMi());
    }
}
