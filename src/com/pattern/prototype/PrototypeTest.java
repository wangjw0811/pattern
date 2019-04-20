package com.pattern.prototype;

import com.pattern.prototype.lowClone.GetPurchaseOrder;
import com.pattern.prototype.lowClone.PurchaseOrder;

/**
 * @author Jims Wang
 * @date 2019-04-20 19:39
 */
public class PrototypeTest {

    public static PurchaseOrder setVlue(PurchaseOrder purchaseOrder){
        PurchaseOrder vo = new PurchaseOrder();
        vo.setCustomer(purchaseOrder.getCustomer());
        vo.setServicer(purchaseOrder.getServicer());
        vo.setTicketno(purchaseOrder.getTicketno());
        //...
        return vo;

    }

    public static void main(String[] args) {
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setTicketno("PO20190420");
        purchaseOrder.setCustomer("测试客户");
        purchaseOrder.setServicer("测试供应商");
        GetPurchaseOrder getPurchaseOrder = new GetPurchaseOrder(purchaseOrder);
        PurchaseOrder copy = (PurchaseOrder)getPurchaseOrder.copy(purchaseOrder);
        System.out.println("原对象"+purchaseOrder);
        System.out.println("复制后的对象"+copy);
        System.out.println(purchaseOrder.getTicketno() == copy.getTicketno());
    }

}
