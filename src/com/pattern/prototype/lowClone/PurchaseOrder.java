package com.pattern.prototype.lowClone;

import java.io.Serializable;

/**
 * @author Jims Wang
 * @date 2019-04-20 19:33
 */
public class PurchaseOrder implements Prototype,Serializable {
    //单号
    private String ticketno;
    //客户
    private String customer;
    //服务商
    private String servicer;

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getServicer() {
        return servicer;
    }

    public void setServicer(String servicer) {
        this.servicer = servicer;
    }

    @Override
    public PurchaseOrder copy() {
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setCustomer(this.customer);
        purchaseOrder.setServicer(this.servicer);
        purchaseOrder.setTicketno(this.ticketno);
        return purchaseOrder;
    }
}
