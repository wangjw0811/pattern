package com.pattern.strategy;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 17:08:12
 **/
public class Order {

    private String uid;
    private String orderNo;
    private double amount;

    public Order(String uid, String orderNo, double amount) {
        this.uid = uid;
        this.orderNo = orderNo;
        this.amount = amount;
    }

    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println(payment.getName()+"支付");
        return payment.pay(uid,amount);
    }


}
