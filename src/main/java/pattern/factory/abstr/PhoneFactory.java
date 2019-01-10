package pattern.factory.abstr;

import pattern.factory.basic.*;

public class PhoneFactory extends AbstractFactory {
    @Override
    public Phone getApple() {
        return new Apple();
    }

    @Override
    public Phone getMeiZu() {
        return new MeiZu();
    }

    @Override
    public Computer getHuaShuo() {
        return new HuaShuo();
    }

    @Override
    public Computer getDaiEr() {
        return new DaiEr();
    }

    @Override
    public Computer getLianXiang() {
        return new Lenovo();
    }

    @Override
    public Phone getOppo() {
        return new Oppo();
    }

    @Override
    public Phone getSanXing() {
        return new SanXing();
    }

    @Override
    public Phone getXiaoMi() {
        return new XiaoMi();
    }
}
