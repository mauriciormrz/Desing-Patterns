package com.company.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor{ //concreteVisitor2


    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {

        System.out.println("Descuento del 10% en gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {

        System.out.println("Descuento del 25% en vuelos con tu tarjeta Black");
    }
}
