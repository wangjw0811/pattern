package com.pattern.template;


/**
 * @author Jims Wang
 * @date 2019-04-19 22:25
 */
public class DoWork extends WorkTemplate {
    private boolean stockLow;

    public DoWork(boolean stockFull) {
        this.stockLow = stockFull;
    }

    @Override
    protected boolean checkStock() {
        return this.stockLow;
    }
}
