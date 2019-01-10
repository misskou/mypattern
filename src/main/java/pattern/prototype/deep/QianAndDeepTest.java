package pattern.prototype.deep;

public class QianAndDeepTest {
    public static void main(String[] args) {
        //此处测试浅拷贝
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
        System.out.println(qiTianDaSheng == clone);
        System.out.println(qiTianDaSheng.birthday == clone.birthday);
        System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);

        //此处测试深拷贝

        QiTianDaSheng clone1 = (QiTianDaSheng) qiTianDaSheng.deepClone();
        System.out.println(qiTianDaSheng == clone1);
        System.out.println(qiTianDaSheng.birthday == clone1.birthday);
        System.out.println(qiTianDaSheng.jinGuBang == clone1.jinGuBang);
    }
}
