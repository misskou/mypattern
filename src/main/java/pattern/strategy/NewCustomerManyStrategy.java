package pattern.strategy;

public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("新客户大批量，打九折");
        return standPrice*0.9;
    }
}
