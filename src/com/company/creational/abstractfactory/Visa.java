package com.company.creational.abstractfactory;

public class Visa implements Card { //Product
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 VISA";
    }
}
