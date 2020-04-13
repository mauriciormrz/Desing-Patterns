package com.company.structural.decorator;

import com.company.structural.decorator.Credit;

public class Black implements Credit { //ConcreteComponent

    @Override
    public void showCredit() {

        System.out.println("El crédito es de un 1.000.000");
    }
}
