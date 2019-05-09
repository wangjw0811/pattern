package com.pattern.strategy;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 16:58:25
 **/
public class WeChatPay extends Payment {
    @Override
    String getName() {
        return "微信";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
