package com.company.structural.bridge;

public class ClassicCreditCard extends CreditCard { //RefinedAbstraction

    public ClassicCreditCard(ICreditCard tarjeta){

        super(tarjeta);
    }

    @Override
    public void realizarPago() {

        tarjeta.realizarPago();
    }
}
