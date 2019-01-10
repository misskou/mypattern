package pattern.factory.func;

import pattern.factory.basic.Phone;
import pattern.factory.basic.SanXing;

public class SanXingFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new SanXing();
    }
}
