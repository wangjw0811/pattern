package com.pattern.prototype.lowClone;

/**
 * @author Jims Wang
 * @date 2019-04-20 19:49
 */
public class GetPurchaseOrder {
    private Prototype prototype;
    public GetPurchaseOrder(Prototype prototype){
        this.prototype =  prototype;
    }
    public Prototype copy(Prototype purchaseOrder){
        return  purchaseOrder.copy();
    }
}
