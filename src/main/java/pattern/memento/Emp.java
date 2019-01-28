package pattern.memento;

/**
 * 原发器类：保存员工的信息
 */
public class Emp {
    private String name;
    private Integer age;
    private double salary;

    //此处定于备忘录类,进行备忘操作，返回备忘录对象
    public EmpMemento Memento(){
        return new EmpMemento(this);
    }

    //进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmpMemento empMemento){
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    public Emp(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
