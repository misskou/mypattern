package pattern.state;

public class Client {
    public static void main(String[] args) {

        HomeContext ctx = new HomeContext();
        ctx.setState(new BookedState());
        ctx.setState(new CheckedInState());
    }
}
