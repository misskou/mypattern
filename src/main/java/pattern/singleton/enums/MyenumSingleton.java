package pattern.singleton.enums;

public enum  MyenumSingleton implements enumSingleton {
    Instance{
        @Override
        public String doSomething() {
            System.out.println("执行了"+this.name());
            return "我是枚举类型的单例（执行了单例中的方法）";
        }
    };

    public static MyenumSingleton getInstance(){
        return MyenumSingleton.Instance;
    }
}
