package com.company.creational.abstractfactory;

public class PaymentMethodFactory implements AbstractFactory <PaymentMethod>{ //ConcreteFactory 2

    @Override
    public PaymentMethod create(String type) {

        if ("CREDIT".equals(type)) {
            return new Credit();
        } else if ("DEBIT".equals(type)) {
            return new Debit();
        }
        return null;
    }
}
