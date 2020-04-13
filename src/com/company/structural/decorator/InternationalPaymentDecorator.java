package com.company.structural.decorator;

public class InternationalPaymentDecorator extends CreditDecorator { //ConcreteDecorator

    public InternationalPaymentDecorator(Credit decoratorCredit) {

        super(decoratorCredit);
    }

    @Override
    public void showCredit() {

        decoratorCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment() {

        System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }

}
