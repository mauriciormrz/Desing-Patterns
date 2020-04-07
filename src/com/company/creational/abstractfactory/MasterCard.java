package com.company.creational.abstractfactory;

public class MasterCard implements Card { //Product

    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 MAST CARD";
    }
}
