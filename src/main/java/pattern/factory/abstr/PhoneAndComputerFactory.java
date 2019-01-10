package pattern.factory.abstr;

import pattern.factory.basic.Computer;
import pattern.factory.basic.Phone;

public abstract  class PhoneAndComputerFactory {
    //创建手机
    public abstract Phone createPhone();
    //创建电脑
    public abstract Computer createComputer();
}
