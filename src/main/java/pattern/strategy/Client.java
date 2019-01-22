package pattern.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new NewCustomerManyStrategy();
        Context context = new Context(strategy);
        context.printPrice(1000);

        strategy = new OldCustomerFewStrategy();
        context.setStrategy(strategy);
        context.printPrice(1000);

    }
}
