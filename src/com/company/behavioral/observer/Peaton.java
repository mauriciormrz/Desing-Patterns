package com.company.behavioral.observer;

public class Peaton implements Observer { //ConcreteObserverA

    @Override
    public void update(Semaforo semaforo) {

        if(semaforo.status.equals("ROJO")){
            System.out.println("Semáforo VERDE para Peaton: -> Peaton SI puede pasar");
        } else {
            System.out.println("Semáforo ROJO para Peaton: -> Peaton NO puede pasar");
        }
    }
}
