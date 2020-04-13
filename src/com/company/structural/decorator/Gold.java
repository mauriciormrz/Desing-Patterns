package com.company.structural.decorator;


public class Gold implements Credit { //ConcreteComponent

    @Override
    public void showCredit() {

        System.out.println("El crédito es de un 50.000");
    }
}
