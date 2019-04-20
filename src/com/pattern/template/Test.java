package com.pattern.template;

/**
 * @author Jims Wang
 * @date 2019-04-19 22:26
 */
public class Test {
    public static void main(String[] args) {
        boolean stockLow = false;
        WorkTemplate template = new DoWork(stockLow);
        template.doWork();

    }

}
