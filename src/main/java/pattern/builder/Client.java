package pattern.builder;

public class Client {
    public static void main(String[] args) {
        AirShipDirector airShipDirector = new kzAirShipDirector(new kzAirShipBuilder());

        AirShip airShip = airShipDirector.createAirShip();

        System.out.println(airShip.getEngine().getEname());

        airShip.lanuch();
    }
}
