package com.company.behavioral.templatemethod;

public class PayPal extends Payment { //SubClass1

    @Override
    void initialize() {

        System.out.println("Inicializando el pago con PayPal...");
    }

    @Override
    void startPayment() {

        System.out.println("Realizando el pago con PayPal...");
    }

    @Override
    void endPayment() {

        System.out.println("Finalizado el pago a través de los servidores PayPal...");
    }
}
