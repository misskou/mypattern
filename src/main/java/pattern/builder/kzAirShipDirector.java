package pattern.builder;

public class kzAirShipDirector implements AirShipDirector{
    private AirShipBulider airShipBulider;

    public AirShipBulider getAirShipBulider() {
        return airShipBulider;
    }

    public kzAirShipDirector(AirShipBulider airShipBulider) {
        this.airShipBulider = airShipBulider;
    }


    @Override
    public AirShip createAirShip() {
        Engine engine = airShipBulider.buildEngine();
        escapeTower escapeTower = airShipBulider.buildEscapeTower();
        orbitalModel orbitalModel = airShipBulider.buildOrbitaModel();

        //装配飞船对象
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModel(orbitalModel);

        return airShip;
    }
}
