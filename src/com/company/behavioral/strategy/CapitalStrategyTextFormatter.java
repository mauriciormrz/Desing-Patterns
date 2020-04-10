package com.company.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter {  //Strategy2

    @Override
    public void format(String text) {

        System.out.println("Texto en Mayusculas: " +  text.toUpperCase());
    }
}
