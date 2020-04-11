package com.company.behavioral.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor { //concreteVisitor1

    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {

        System.out.println("Descuento del 3% en gasolina con tu tarjeta Clásica");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {

        System.out.println("Descuento del 5% en vuelos con tu tarjeta Clásica");
    }
}
