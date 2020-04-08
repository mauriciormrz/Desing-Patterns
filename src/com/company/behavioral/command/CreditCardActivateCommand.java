package com.company.behavioral.command;

public class CreditCardActivateCommand implements Command { // ConcreteCommand

    CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard){

        this.creditCard = creditCard;
    }
    @Override
    public void execute() {

        creditCard.sendPinNumberToCustomer();
        creditCard.activate();
        creditCard.sendSMSToCustomerActivate();
    }
}
