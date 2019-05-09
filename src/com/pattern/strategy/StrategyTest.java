package com.pattern.strategy;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 17:13:57
 **/
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("001","201905090001",1035.33);
        PayState result = order.pay(PayStrategy.WECHAT_PAY);
        System.out.println(result);

    }
}
