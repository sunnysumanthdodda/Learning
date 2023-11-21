package com.learning.exceptionhandling;

class Amount1{
    private final String currency;
    private int amount;

    public Amount1(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount1 that) throws CurrenciesdonoMatchException {
        if(!this.currency.equalsIgnoreCase(that.currency)){
            throw new CurrenciesdonoMatchException(this.currency + " & " + that.currency + " don't match");
        }
        this.amount+= that.amount;
    }
    public String toString(){
        return amount+" "+currency;
    }

    static class CurrenciesdonoMatchException extends Exception{
        public CurrenciesdonoMatchException(String msg){
            super(msg);
        }
    }
}
public class CustomizedExceptionRunner {
    public static void main(String[] args) throws Amount1.CurrenciesdonoMatchException {
        Amount1 amount1 = new Amount1("USD", 40);
        Amount1 amount2 = new Amount1("USD", 30);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}