package pattern.factory.func;

import pattern.factory.basic.Phone;
import pattern.factory.basic.XiaoMi;

public class XiaoMiFactory implements  Factory {
    @Override
    public Phone getPhone() {
        return new XiaoMi();
    }
}
