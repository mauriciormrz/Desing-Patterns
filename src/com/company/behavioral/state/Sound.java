package com.company.behavioral.state;

public class Sound implements MobileAlertState {  //ConcreteState

    @Override
    public void alert(MobileAlertStateContext context) {

        System.out.println("Ring...Ring");
    }
}
