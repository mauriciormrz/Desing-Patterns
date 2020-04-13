package com.company.structural.facade;

public class Gold implements Credit{ //ModuleA


    @Override
    public void showCredit() {

        System.out.println("La tarjeta Gold tiene un crédito de $50");
    }
}
