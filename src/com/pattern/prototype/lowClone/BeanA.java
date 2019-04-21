package com.pattern.prototype.lowClone;

import java.util.List;

/**
 * @author Jims Wang
 * @date 2019-04-21 16:54
 */
public class BeanA implements Prototrype {

    private String name;

    private int age;

    private List hobbies;

    public BeanA(String name, int age,List hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public BeanA() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public BeanA clone() {
        BeanA beanA = new BeanA();
        beanA.setAge(this.age);
        beanA.setName(this.name);
        beanA.setHobbies(this.hobbies);
        return beanA;
    }
}
