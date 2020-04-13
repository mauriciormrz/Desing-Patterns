package com.company.structural.facade;

public class Black implements Credit{ //ModuleC

    @Override
    public void showCredit() {

        System.out.println("La tarjeta Black tiene un crédito de $1000");
    }
}
