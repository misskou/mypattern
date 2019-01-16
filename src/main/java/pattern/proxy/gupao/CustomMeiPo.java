package pattern.proxy.gupao;

import java.lang.reflect.Method;

public class CustomMeiPo implements GPInvocationHandler {
    //被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target){
        this.target = target;

        Class<? extends Person> clazz = target.getClass();

        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆：我要给你找对象");
        method.invoke(this.target,args);
        System.out.println("如果合适，就准备办事");

        return null;
    }
}
