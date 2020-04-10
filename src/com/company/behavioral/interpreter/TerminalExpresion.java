package com.company.behavioral.interpreter;

public class TerminalExpresion implements Expression { //TerminalExpresion

    private String text;

    public TerminalExpresion(String text) {

        this.text = text;
    }

    @Override
    public boolean interpret(String context) {

        if (context.contains(text)){
            return true;
        }
        return false;
    }
}
