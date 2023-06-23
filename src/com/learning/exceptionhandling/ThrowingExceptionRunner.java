package com.learning.exceptionhandling;

class Amount{
    private final String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception {
        if(!this.currency.equals(that.currency)){
            throw new Exception(this.currency+" & "+that.currency+" don't match");
        }
        this.amount+= that.amount;
    }
    public String toString(){
        return amount+" "+currency;
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amount1 = new Amount("USD", 40);
        Amount amount2 = new Amount("INR", 30);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
