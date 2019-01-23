package pattern.state;

/**
 * 入驻状态
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住，勿打扰");
    }
}
