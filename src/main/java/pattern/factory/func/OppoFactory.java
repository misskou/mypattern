package pattern.factory.func;

import pattern.factory.basic.Oppo;
import pattern.factory.basic.Phone;

public class OppoFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Oppo();
    }
}
