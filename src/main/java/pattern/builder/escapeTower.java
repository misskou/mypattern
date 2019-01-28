package pattern.builder;

public class escapeTower {
    private String name;

    public escapeTower(String name) {
        System.out.println("逃逸塔");
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
