package com.pattern.strategy;

import java.util.function.ToDoubleBiFunction;

/**
 * @author Jims Wang
 * @date 2019-04-19 21:08
 */
public class Test {
    public static void main(String[] args) {

        String prefix = "PO";
        GetTicketNo getTicketNo = new GetTicketNo(TicketNoStrategyFactory.getTicketNo((prefix)));
        getTicketNo.execute(prefix);





    }
}
