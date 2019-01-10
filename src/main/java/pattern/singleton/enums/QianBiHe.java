package pattern.singleton.enums;
//枚举类似类，一个枚举可以拥有成员变量，成员方法，构造方法
public enum QianBiHe {
    A{
        public String getType(){
            return "实例A的方法";
        }
    },B,C,D,
    HeZi(){
        String qb = "qianbi";
        String xd = "xiaodao";
        String xpc = "xiangpicha";
    };

    static int value;
    public static int getValue(){
        return  value;
    }

    String type;
    public String getType(){
        return type;
    }


}
