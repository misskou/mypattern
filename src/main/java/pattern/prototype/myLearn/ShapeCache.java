package pattern.prototype.myLearn;

import java.util.Enumeration;
import java.util.Hashtable;

//使用者角色：维护一个注册表，并提供一个找出正确实例原型的方法。
//最后，提供一个获取新实例的方法，用来委托复制实例的方法生成新实例。
//获取实体类，并把它们存储在一个Hashtable中
public class ShapeCache {
    //shapeMap维护一个注册表
    protected static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    //提供一个获取新实例的方法
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);//提供一个找出正确实例原型的方法
        return (Shape)cachedShape.clone();//委托复制实例的方法生成新实例。
    }

    /*
      对每种形状都运行数据库查询，并创建该形状shapeMap.put(shapeKey,Shape)
      例如，我们添加三种形状
     */
    public static void loadCache(){
        Cicle cicle = new Cicle();
        cicle.setId("1");
        shapeMap.put(cicle.getId(),cicle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Hashtable<String, Shape> shapeMap = ShapeCache.shapeMap;
        Enumeration<Shape> elements = shapeMap.elements();
        while (elements.hasMoreElements()){
            Shape shape = elements.nextElement();
            System.out.println(shape.getType());
        }


    }
}
