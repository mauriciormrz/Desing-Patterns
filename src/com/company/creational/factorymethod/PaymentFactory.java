package com.company.creational.factorymethod;

public class PaymentFactory { //Creator

    public static Payment buildPayment(TypePayment typePayment){

        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }

    }
}
