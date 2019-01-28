package pattern.builder;

public class AirShip {

    private orbitalModel orbitalModel;
    private escapeTower escapeTower;
    private Engine engine;

    public pattern.builder.orbitalModel getOrbitalModel() {
        return orbitalModel;
    }

    public pattern.builder.escapeTower getEscapeTower() {
        return escapeTower;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setOrbitalModel(pattern.builder.orbitalModel orbitalModel) {
        this.orbitalModel = orbitalModel;
    }

    public void setEscapeTower(pattern.builder.escapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AirShip() {

    }

    public void lanuch(){
        System.out.println("调用发射方法！");
    }
}
