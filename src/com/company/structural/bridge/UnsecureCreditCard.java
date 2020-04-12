package com.company.structural.bridge;


public class UnsecureCreditCard implements ICreditCard { //ConcreteImplementor

    @Override
    public void realizarPago() {

        System.out.println("Pago realizado SIN seguridad");
    }
}
