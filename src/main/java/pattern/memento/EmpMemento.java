package pattern.memento;

/**
 * 备忘录类：用来保存原发器类Emp对象的状态
 */
public class EmpMemento {

    private String name;
    private Integer age;
    private double salary;

    public EmpMemento(Emp emp) {
        this.name = emp.getName();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
