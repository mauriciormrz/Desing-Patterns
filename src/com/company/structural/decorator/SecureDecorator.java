package com.company.structural.decorator;

public class SecureDecorator extends CreditDecorator{ //ConcreteDecorator


    public SecureDecorator(Credit decoratorCredit) {
        super(decoratorCredit);
    }

    @Override
    public void showCredit() {

        decoratorCredit.showCredit();
        configSecure();
    }

    private void configSecure() {

        System.out.println("La tarjeta ha sido configurada con Seguridad Máxima");
    }
}
