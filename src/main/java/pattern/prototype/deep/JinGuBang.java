package pattern.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {
    public int h = 100;
    public int w = 50;

    public void big(){
        this.h *=2;
        this.w *=1.5;
    }

    public void small(){
        this.h *=0.6;
        this.w *=0.4;
    }
}
