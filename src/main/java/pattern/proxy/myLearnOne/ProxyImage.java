package pattern.proxy.myLearnOne;

/*
  此类为代理类:封装实现类，调度实现类的方法，实现代理模式。
  当被请求时，使用ProxyImage来获取RealImage类的对象。
 */
public class ProxyImage implements Image {
    private String fileName;

    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        //判断真正的Image对象是否为空，并创建
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        //调用真正的Image实现类
        realImage.display();
    }
}
