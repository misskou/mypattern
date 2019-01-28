package pattern.builder;

public class Engine {
    private String ename;

    public Engine(String ename) {
        System.out.println("发动机");
        this.ename = ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }
}
