package pattern.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 负责人类：负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento empMemento; //简单备份保存一次的备份

    private List<EmpMemento> list = new ArrayList<EmpMemento>();//保存多个备忘录点

    private Stack<EmpMemento> stack = new Stack<EmpMemento>();

    //如果保存点特别多的时候，将备忘录序列化/持久化到磁盘上

    public List<EmpMemento> getList() {
        return list;
    }

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }

    public void setList(List<EmpMemento> list) {
        this.list = list;
    }
}
