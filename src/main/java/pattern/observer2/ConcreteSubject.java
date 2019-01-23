package pattern.observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable {
    private int state;

    public void set(int s){
        //目标对象的状态发生了变化
        state = s;
        //表示目标对象已经做了修改
        setChanged();
        //通知所有的观察者
        notifyObservers();

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
