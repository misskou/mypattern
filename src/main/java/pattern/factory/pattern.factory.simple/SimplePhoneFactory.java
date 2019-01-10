package pattern.factory.simple;

import pattern.factory.basic.Apple;
import pattern.factory.basic.Oppo;
import pattern.factory.basic.SanXing;
import pattern.factory.basic.Phone;

/**
 * 简单工厂模式：
 * 把创建手机的操作细节都放到了工厂里面去,
 * 客户直接使用工厂的创建工厂方法,传入想要的手机就行了,而不必去知道创建的细节.
 */
public class SimplePhoneFactory {


    //这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品,
    //当扩展新产品时，需要修改增加相应的创建业务逻辑，这显然是违背开闭原则的
    //对于新产品的加入，工厂类是很被动的:被称为全能类，上帝类

    public Phone getPhone(String name){
        if("苹果".equals(name)){
            return new Apple();
        }else if("三星".equals(name)){
            return new SanXing();
        }else if("欧泊".equals(name)){
            return new Oppo();
        }else{
            System.out.print("不能生产此产品");
            return null;
        }
    }
}
