package com.company.behavioral.chainofresponsability;

public interface ApproveLoanChain {  //Handle

    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
