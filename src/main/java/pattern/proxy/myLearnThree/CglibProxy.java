package pattern.proxy.myLearnThree;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib-nodep-2.2.3.jar
public class CglibProxy implements MethodInterceptor {
    Object target;

    public CglibProxy(Object target){
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("# Beforing invocation method");
        Object invoke = method.invoke(target, objects);
        System.out.println("# Aftering invocation method");
        return invoke;
    }

    public static Object getProxy(Object target ){
        Enhancer enhancer = new Enhancer();

        //设置代理对象
        //设置代理对象

        enhancer.setSuperclass(target.getClass());

        //设置代理人

        enhancer.setCallback(new CglibProxy(target));

        return enhancer.create();
    }
}
