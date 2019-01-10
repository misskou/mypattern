package pattern.factory.func;

import pattern.factory.basic.Apple;
import pattern.factory.basic.Phone;

public class AppleFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Apple();
    }
}
