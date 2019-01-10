package pattern.factory.abstr;

import pattern.factory.basic.Computer;
import pattern.factory.basic.Lenovo;
import pattern.factory.basic.Phone;
import pattern.factory.basic.XiaoMi;

public class DomesticCreate extends PhoneAndComputerFactory {
    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }

    @Override
    public Computer createComputer() {
        return new Lenovo();
    }
}
