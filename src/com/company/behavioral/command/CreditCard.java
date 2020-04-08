package com.company.behavioral.command;

public class CreditCard { //Receiver

    public void sendPinNumberToCustomer(){

        System.out.println("El pin number ha sido enviado al Cliente.");
    }

    public void sendSMSToCustomerActivate(){

        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada.");
    }

    public void activate(){

        System.out.println("La tarjeta ha sido activada");
    }

    public void deactivate(){

        System.out.println("La tarjeta ha sido desactivada");
    }

    public void sendSMSCustomerDeactivate(){

        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido desactivada.");
    }
}
