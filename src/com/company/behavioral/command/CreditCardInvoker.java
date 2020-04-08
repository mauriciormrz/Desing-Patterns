package com.company.behavioral.command;

public class CreditCardInvoker { //Invoker

    private Command command;

    public CreditCardInvoker(){}

    public void setCommand(Command command){

        this.command = command;
    }

    public void run(){

        command.execute();
    }
}
