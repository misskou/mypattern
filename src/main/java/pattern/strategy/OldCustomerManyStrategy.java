package pattern.strategy;

public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("老客户大批量，打八折");
        return standPrice*0.8;
    }
}
