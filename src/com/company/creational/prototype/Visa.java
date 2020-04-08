package com.company.creational.prototype;

public class Visa implements PrototypeCard {  //Concrete Prototype

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void getCard() {

        System.out.println("Esta es una tarjeta Visa");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {

        System.out.println("Clonando tarjeta Visa...");
        return (Visa) super.clone();
    }
}
