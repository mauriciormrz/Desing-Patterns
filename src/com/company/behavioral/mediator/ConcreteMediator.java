package com.company.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;

    public void setUser1(ConcreteColleague1 colleague1){

        user1 = colleague1;
    }

    public void setUser2(ConcreteColleague2 colleague2){

        user2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {

        if(colleague == user1){
            user2.messageReceiver(message);
        } else if (colleague == user2){
            user1.messageReceiver(message);
        }
    }
}
