package pattern.prototype.myLearn;

import java.util.Hashtable;

//PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        //获取loadCache（）方法创建的三种对象
        Hashtable<String, Shape> shapeMap = ShapeCache.shapeMap;

        Shape shapeone = shapeMap.get("1");

        Shape shapetwo = shapeMap.get("2");

        Shape shapethree = shapeMap.get("3");

        //调用getShape()方法克隆的对象
        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape :"+cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape :"+ cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("Shape :"+ cloneShape3.getType());

        //打印查看getShape()方法创建的对象是否和loadCache（）方法创建的对象是同一个 ，证明确实是clone了。
        System.out.println(shapeone);
        System.out.println(cloneShape);
        System.out.println(shapetwo);
        System.out.println(cloneShape2);
        System.out.println(shapethree);
        System.out.println(cloneShape3);
    }
}
