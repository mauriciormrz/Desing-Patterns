package com.company.behavioral.observer;

public class Semaforo { //Observable



    public String status;

    public Semaforo(String status) {

        this.status = status;
    }

    public String getStatus() {

        return status;
    }
}
