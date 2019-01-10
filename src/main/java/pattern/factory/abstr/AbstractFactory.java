package pattern.factory.abstr;

import pattern.factory.basic.Computer;
import pattern.factory.basic.Phone;

public abstract class AbstractFactory {

    //获得一个Apple手机
    public abstract Phone getApple();
    //获得一个Oppo手机
    public abstract Phone getOppo();
    //获得一个三星手机
    public abstract Phone getSanXing();
    //获得一个小米手机
    public abstract Phone getXiaoMi();

    //新增魅族手机
    public  abstract Phone getMeiZu();


    //-------------
    //获得华硕电脑
    public abstract Computer getHuaShuo();
    //获得戴尔电脑
    public abstract Computer getDaiEr();
    //获得联想电脑
    public abstract Computer getLianXiang();
}
