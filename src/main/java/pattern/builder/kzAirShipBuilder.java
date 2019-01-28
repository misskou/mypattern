package pattern.builder;

/**
 * 具体构造者
 */
public class kzAirShipBuilder implements AirShipBulider {

    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机01");
    }

    @Override
    public escapeTower buildEscapeTower() {
        System.out.println("构建逃逸塔");
        return new escapeTower("逃逸塔01");
    }

    @Override
    public orbitalModel buildOrbitaModel() {
        System.out.println("构建轨道舱");
        return new orbitalModel("轨道舱01");
    }


}
