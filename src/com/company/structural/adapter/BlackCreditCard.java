package com.company.structural.adapter;

public class BlackCreditCard implements Secure{

    @Override
    public void payWithSecureLevelA() {

        System.out.println("Tarjeta Black: Pagando con seguridad ALTA A");
    }

    @Override
    public void payWithSecureLevelZ() {



    }
}
