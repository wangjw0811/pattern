package com.pattern.strategy;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 16:48:30
 **/
public abstract class Payment {

    abstract String getName();

    protected abstract double queryBalance(String uid);

    public PayState pay(String uid,double amount){
        if(queryBalance(uid) < amount){
            return new PayState(500,"交易失败","余额不足");
        }
        return new PayState(200,"交易成功","扣款"+amount);
    }

}
