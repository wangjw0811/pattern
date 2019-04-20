package com.pattern.strategy;

/**
 * @author Jims Wang
 * @date 2019-04-19 21:14
 */
public class GetTicketNo {
    private TicketNoStrategy ticketNoStrategy;
    public GetTicketNo(TicketNoStrategy ticketNoStrategy){
        this.ticketNoStrategy = ticketNoStrategy;
    }
    public String execute(String prefix){
       return ticketNoStrategy.getTicketNo(prefix);
    }

}
