package com.company.creational.prototype;

public class Amex implements PrototypeCard { //Concrete Prototype

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void getCard() {

        System.out.println("Esta es una tarjeta Amex");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {

        System.out.println("Clonando tarjeta Amex...");
        return (Amex) super.clone();
    }
}
