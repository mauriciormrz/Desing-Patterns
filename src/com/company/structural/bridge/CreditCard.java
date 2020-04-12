package com.company.structural.bridge;

public abstract class CreditCard { //Abstraction

    protected ICreditCard tarjeta;

    protected CreditCard(ICreditCard tarjeta){

        this.tarjeta = tarjeta;
    }

    public abstract void realizarPago();
}
