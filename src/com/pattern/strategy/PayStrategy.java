package com.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 16:59:29
 **/
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WeChatPay";
    public static final String DEFAULT_PAY = ALI_PAY;


    private static Map<String,Payment> payStrategy = new HashMap<>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
    }

    public static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }


}
