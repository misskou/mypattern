package pattern.templeteMethod;

public class Client {
    public static void main(String[] args) {
        BankTempleteMethod btm = new DrawMoney();
        btm.process();

        BankTempleteMethod btm2 = new liCai();
        btm2.process();

        //采用匿名内部类的方式
        BankTempleteMethod btm3 = new BankTempleteMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱，我这里有100万人民币");
            }
        };

        btm3.process();
    }
}

class DrawMoney extends BankTempleteMethod{

    @Override
    public void transact() {
        System.out.println("办理取款业务");
    }
}

class liCai extends BankTempleteMethod{
    @Override
    public void transact() {
        System.out.println("办理理财业务");
    }
}


