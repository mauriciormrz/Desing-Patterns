package com.company.behavioral.mediator;


public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {

        mediator.send(message,this);
    }

    @Override
    public void messageReceiver(String message) {

        System.out.println("User2 ha recibido el siguiente mensaje del chat: " + message);
    }
}
