package com.company.behavioral.mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {

        super(mediator);
    }

    @Override
    public void send(String message) {

        mediator.send(message,this);
    }

    @Override
    public void messageReceiver(String message) {

        System.out.println("User1 ha recibido el siguiente mensaje del chat: " + message);
    }
}
