package com.pattern.template;

/**
 * @author Jims Wang
 * @date 2019-04-19 22:16
 */
public abstract class WorkTemplate {

    protected final void doWork(){
        // 1 销售员接单
        this.getOrder();
        // 2 签署销售合同
        this.signSales();

        // 3 采购，判断库存是否充足，不足则需进行采购
        if(checkStock()){
            this.Purchase();
            // 签署采购合同
            this.signPurchase();
        }
        // 4 给客户发货
        this.send();


    }

    protected final void signSales(){
        System.out.println("签署销售合同");
    }

    protected final void signPurchase(){
        System.out.println("签署采购合同");
    }

    protected final void Purchase(){
        System.out.println("库存不足进行采购");
    }

    protected final void getOrder(){
        System.out.println("接收客户订单");
    }
    protected final void send(){
        System.out.println("给客户发货");
    }

    protected boolean checkStock(){
        return false;
    }
}
