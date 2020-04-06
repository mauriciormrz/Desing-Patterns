package com.company.creational.factorymethod;

public class CardPayment implements Payment { //ConcreteProduct

    @Override
    public void doPayment() {

        System.out.println("Pagando con Tarjeta de Crédito");
    }
}
