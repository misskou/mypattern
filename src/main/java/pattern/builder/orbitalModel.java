package pattern.builder;

public class orbitalModel {

    private String name;

    public orbitalModel(String name) {
        System.out.println("轨道舱");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
