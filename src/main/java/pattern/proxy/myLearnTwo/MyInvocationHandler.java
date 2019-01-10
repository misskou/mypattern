package pattern.proxy.myLearnTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
//定义一个处理器类
public class MyInvocationHandler implements InvocationHandler {

    //此处需要真正角色，所以把真实角色传进来
    Subject realSubject;

    public MyInvocationHandler(Subject realSubject){
        this.realSubject = realSubject;
    }

    /**
     *
     * @param proxy 代理类
     * @param method 要调用的方法
     * @param args  执行的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(method.getName().equals("sellBooks")){
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        }

        if(method.getName().equals("speak")){
            String str = (String) method.invoke(realSubject,args);
            System.out.println("调用的是说话的方法");
            return str;
        }

        return "没有相关方法";

    }
}
