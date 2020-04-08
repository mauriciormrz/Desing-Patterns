package com.company.behavioral.chainofresponsability;

public class Black implements ApproveLoanChain { //ConcreteHandler

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {

        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {

        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {

        if( totalLoan > 50 ){
            System.out.println("Esta solicitud de tarjeta de crédito la maneja la tarjeta Black");
        } else {
            next.creditCardRequest(totalLoan);
        }
    }
}
