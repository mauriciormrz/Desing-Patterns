package com.company.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter { //Strategy1


    @Override
    public void format(String text) {

        System.out.println("Texto en Minusculas: " +  text.toLowerCase());
    }
}
