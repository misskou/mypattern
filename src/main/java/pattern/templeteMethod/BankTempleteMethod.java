package pattern.templeteMethod;
/**
 * 模拟银行业务

 */
public abstract class BankTempleteMethod {

    //具体业务
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();//办理具体的业务，钩子方法

    public void evaluate(){
        System.out.println("反馈评价");
    }

    /*
      模板方法，把基本的操作组合到一起，子类一般不能重写
     */
    public final void process(){
        takeNumber();

        transact();

        evaluate();
    }
}
