package com.company.behavioral.visitor;

public class OfertaVuelos implements OfertaElemento { //concreteElementA

    @Override
    public void accept(CreditCardVisitor visitor) {

        visitor.ofertaVuelos(this);
    }
}
