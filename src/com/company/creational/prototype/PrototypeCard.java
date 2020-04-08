package com.company.creational.prototype;

public interface PrototypeCard extends Cloneable {  //Prototype

    void getCard();
    PrototypeCard clone() throws CloneNotSupportedException;
}
