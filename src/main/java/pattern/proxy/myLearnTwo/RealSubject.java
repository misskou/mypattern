package pattern.proxy.myLearnTwo;
//真实对象
public class RealSubject implements Subject {

    @Override
    public int sellBooks(String bookName) {

        System.out.println(bookName);

        return 1;
    }

    @Override
    public String speak(String action) {

        System.out.println(action);

        return "李四";
    }
}
