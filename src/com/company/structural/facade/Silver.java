package com.company.structural.facade;

public class Silver implements Credit{ //ModuleB


    @Override
    public void showCredit() {

        System.out.println("La tarjeta Silver tiene un crédito de $200");
    }
}
