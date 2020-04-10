package com.company.behavioral.state;

public class Vibration implements MobileAlertState { //ConcreteState

    @Override
    public void alert(MobileAlertStateContext context) {

        System.out.println("Vibrando... Vibrando... Vibrando");
    }
}
