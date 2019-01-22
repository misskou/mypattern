package pattern.strategy;

/**
 * 实现起来比较容易，符合一般开发人员思路
 * 假如类型特别多，算法特别复杂时，代码量将很大，整个条件语句的代码将很长，
 * 维护起来将变得，很困难。如果有新增类型，就要频繁修改此处的代码，不符合开闭原则。
 *
 */
public class TestStrategy {

    public double getPrice(String type,double s){
        if(type.equals("普通客户小批量")){
            System.out.println("不打折，原价");
            return s;
        }else if(type.equals("普通客户大批量")){
            System.out.println("普通客户大批量,打九折");
            return s*0.9;
        }else if(type.equals("老客户小批量")){
            System.out.println("老客户小批量，打八五折");
            return s*0.85;
        }else if(type.equals("老客户大批量")){
            System.out.println("老客户小批量，打八折");
            return s*0.8;
        }
        return s;

    }
}
