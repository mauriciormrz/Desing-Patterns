package com.company.behavioral.visitor;

public class OfertaGasolina implements OfertaElemento{ //concreteElementB

    @Override
    public void accept(CreditCardVisitor visitor) {

        visitor.ofertaGasolina(this);
    }
}
