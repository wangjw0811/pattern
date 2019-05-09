package com.pattern.delegate;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 16:05:33
 **/
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("业务架构",new Leader());
    }
}
