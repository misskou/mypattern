package pattern.prototype.myLearn;

public class Client {
    public static void main(String[] args) {
        ConcreatePrototype cp = new ConcreatePrototype();
        for(int i=0;i<10 ;i++){
            ConcreatePrototype clonep = (ConcreatePrototype)cp.clone();
            clonep.show();
        }
    }
}
