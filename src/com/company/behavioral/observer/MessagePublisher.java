package com.company.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {  //notifyObserver

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {

        observers.add(o);
    }

    @Override
    public void detach(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Semaforo semaforo) {

        for(Observer o: observers){
            o.update(semaforo);
        }
    }
}
