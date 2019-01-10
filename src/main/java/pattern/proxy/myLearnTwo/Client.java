package pattern.proxy.myLearnTwo;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        //真实对象
        Subject realSubject = new RealSubject();

        MyInvocationHandler mih = new MyInvocationHandler(realSubject);

        //代理对象:java.lang.reflect.Proxy生成动态代理类和对象
        //每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
        Subject subjectProxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class},mih);

        subjectProxy.sellBooks("卖数学书");

        subjectProxy.speak("李斯同学");

    }
}
