package com.pattern.prototype;

import com.pattern.prototype.deepClone.QiTianDaSheng;
import com.pattern.prototype.lowClone.BeanA;
import com.pattern.prototype.lowClone.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jims Wang
 * @date 2019-04-21 17:02
 */
public class PrototypeTest {

    public static void main(String[] args) {
        // 1 浅克隆
        BeanA bean = new BeanA("Jims",18,new ArrayList());
        System.out.println(bean);
        Client client = new Client(bean);
        BeanA beanClone = (BeanA)client.startClone(bean);
        System.out.println(beanClone);
        System.out.println(bean == beanClone);
        System.out.println("原对象中的引用类型地址值：" + bean.getHobbies());
        System.out.println("克隆对象中的引用类型地址值：" + beanClone.getHobbies());
        System.out.println("对象地址比较："+(beanClone.getHobbies() == bean.getHobbies()));
        //克隆对象中的引用类型地址值：[]
        //原对象中的引用类型地址值：[]
        //对象地址比较：true ——》 由此可以看出复制的不是值，而是引用的地址
        //所以当我们修改任意一个对象中的属性值， bean 和
        //beanClone 的hobbies 值都会改变。这就是我们常说的浅克隆。只是完整
        //复制了值类型数据，没有赋值引用对象。换言之，所有的引用对象仍然指向原来的对象
        beanClone.getHobbies().add("编程");
        System.out.println("原对象中的引用类型地址值：" + bean.getHobbies());
        System.out.println("克隆对象中的引用类型地址值：" + beanClone.getHobbies());
        //克隆对象中的引用类型地址值：[编程]
        //原对象中的引用类型地址值：[编程]

        // 2 深克隆
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
        System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        //如果我们克隆的目标的对象是单例对象，那意味着，深克隆就会破坏单例。实际上防止
        //克隆破坏单例解决思路非常简单，禁止深克隆便可。要么让我们的单例类不实现
        //Cloneable 接口；要么我们重写clone()方法，在clone 方法中返回单例对象即可

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        List listClone = (List) ((ArrayList) list).clone();
        System.out.println(list.get(0) == listClone.get(0));

    }
}
