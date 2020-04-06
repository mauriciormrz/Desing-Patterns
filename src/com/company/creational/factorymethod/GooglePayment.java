package com.company.creational.factorymethod;

public class GooglePayment implements Payment { //ConcreteProduct

    @Override
    public void doPayment() {

        System.out.println("Pagando con Google Payment");
    }
}
