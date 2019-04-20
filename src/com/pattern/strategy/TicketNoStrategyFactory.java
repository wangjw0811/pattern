package com.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jims Wang
 * @date 2019-04-19 21:26
 */
public class TicketNoStrategyFactory {

    private static Map<String,TicketNoStrategy> map = new HashMap<>();

    static {
        map.put(OrderType.purchase,new PurchaseOrder());
        map.put(OrderType.sales,new SalesOrder());
    }

    private TicketNoStrategyFactory(){
    }

    public static TicketNoStrategy getTicketNo(String prefix){
        TicketNoStrategy ticketNoStrategy = map.get(prefix);
        if(ticketNoStrategy == null){
            throw new RuntimeException("未定义前缀，获取单号失败");
        }
        return ticketNoStrategy;
    }

    private interface OrderType {
        String purchase = "PO";
        String sales = "SO";
    }

}
