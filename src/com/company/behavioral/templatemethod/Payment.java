package com.company.behavioral.templatemethod;

public abstract class Payment { //AbstractClass

    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    public final void makePayment(){

        initialize();
        startPayment();
        endPayment();
    }
}
