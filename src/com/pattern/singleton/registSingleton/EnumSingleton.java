package com.pattern.singleton.registSingleton;

/**
 *  注册式单例之枚举式单例
 *  反编译发现:枚举式单例在静态代码块中就给INSTANCE 进行了赋值，是饿汉式单例的实现
 *  不能被序列化攻击:枚举类型其实通过类名和Class 对象类找到一个唯一的枚举对象。因此，枚举对
 * 象不可能被类加载器加载多次
 *  不能被反射攻击JDK已限制用反射来创建枚举类型
 * @author Jims Wang
 * @date 2019-04-20 09:58
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }


}
