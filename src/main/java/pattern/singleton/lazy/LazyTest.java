package pattern.singleton.lazy;

public class LazyTest {
    public static void main(String[] args) {
        //懒汉式：单线程测试
        System.out.println(LazyOne.getSingleton());
    }
}
