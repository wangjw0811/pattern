package com.pattern.prototype.deepClone;

import java.io.*;
import java.util.Date;

/**
 * @author Jims Wang
 * @date 2019-04-21 17:43
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;
    public QiTianDaSheng(){
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    public Object clone() {
        return this.deepClone();
    }

    private Object deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
