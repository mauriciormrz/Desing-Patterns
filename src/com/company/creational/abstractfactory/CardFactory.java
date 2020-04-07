package com.company.creational.abstractfactory;

public class CardFactory implements AbstractFactory<Card> { //ConcreteFactory 1

    @Override
    public Card create(String type) {

        if ("VISA".equals(type)) {
            return new Visa();
        } else if ("MASTERCARD".equals(type)) {
            return new MasterCard();
        }
        return null;
    }
}
