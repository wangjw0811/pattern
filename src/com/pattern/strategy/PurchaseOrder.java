package com.pattern.strategy;

/**
 * @author Jims Wang
 * @date 2019-04-19 21:04
 */
public class PurchaseOrder implements TicketNoStrategy {
    @Override
    public String getTicketNo(String prefix) {
        return Util.getNo(prefix);
    }
}
