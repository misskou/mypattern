package pattern.factory.abstr;

import pattern.factory.basic.Apple;
import pattern.factory.basic.Computer;
import pattern.factory.basic.DaiEr;
import pattern.factory.basic.Phone;

public class AbroadCreate extends PhoneAndComputerFactory {
    @Override
    public Phone createPhone() {
        return new Apple();
    }

    @Override
    public Computer createComputer() {
        return new DaiEr();
    }
}
