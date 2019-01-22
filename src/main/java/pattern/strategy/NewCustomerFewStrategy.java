package pattern.strategy;

public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("不打折，原价");
        return standPrice;
    }
}
