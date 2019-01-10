package pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//spring使用的注册式单例
public class RegisterMap {
    private RegisterMap(){};
    //线程安全

    private static Map<String,Object> register = new ConcurrentHashMap<String,Object>();

    public static  Object getBean(String name) {
        if(!register.containsKey(name)){
            Object obj = null;
            try {

                //newInstance: 弱类型。低效率。只能调用无参构造。
                //new: 强类型。相对高效。能调用任何public构造。
                /*Class<?> aClass = Class.forName(name);
                obj = aClass.newInstance();*/
                obj = Class.forName(name).newInstance();
                register.put(name, obj);
            }catch (Exception e){
                e.printStackTrace();
            }
            return obj;
        }else{
            return register.get(name);
        }

    }

    public static void main(String[] args) {
        Object obj =  RegisterMap.getBean("pattern.singleton.register.RegisterMap");

        System.out.println(obj);
    }
}
