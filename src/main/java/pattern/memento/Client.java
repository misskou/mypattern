package pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("张三",10,3800);
        System.out.println("第一次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

        taker.setEmpMemento(emp.Memento());

        emp.setName("李四");
        emp.setAge(20);
        emp.setSalary(5600);
        System.out.println("第二次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());



        emp.recovery(taker.getEmpMemento());//恢复备忘录对象保存的状态
        System.out.println("第二次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());


        //测试保存多个备忘录点
        List<EmpMemento> li = new ArrayList<EmpMemento>();
        Emp emp1 = new Emp("王五",11,3300);
        li.add(emp1.Memento());

        Emp emp2 = new Emp("赵六",12,3200);
        li.add(emp2.Memento());

        Emp emp3 = new Emp("李七",15,4000);
        li.add(emp3.Memento());

        taker.setList(li);

        System.out.println(taker.getList().get(1).getName());



    }
}
