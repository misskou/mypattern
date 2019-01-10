package pattern.prototype.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable,Serializable{

    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    public Object clone(){
        QiTianDaSheng qtds = null;
        try{
            qtds = (QiTianDaSheng) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return qtds;
    }

    public Object deepClone(){

        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;

    }

}
