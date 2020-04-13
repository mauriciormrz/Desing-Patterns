package com.company.structural.decorator;

public class CreditDecorator implements Credit { //Decorator

    protected Credit decoratorCredit;

    public CreditDecorator(Credit decoratorCredit) {

        this.decoratorCredit = decoratorCredit;
    }

    @Override
    public void showCredit() {

        decoratorCredit.showCredit();
    }
}
