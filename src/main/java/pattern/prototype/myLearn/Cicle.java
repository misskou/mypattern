package pattern.prototype.myLearn;

/**
 * 具体原型角色：实现用于复制现有实例来生成新实例的方法
 * 实现复制现有实例来生成新实例的方法（也可以由超类完成）此次超类Shape实现了clone方法。
 */
public class Cicle extends Shape {
    public Cicle(){
        type = "Cicle";
    }

    @Override
    void draw() {
        System.out.println("Cicle:: draw() method");
    }
}
