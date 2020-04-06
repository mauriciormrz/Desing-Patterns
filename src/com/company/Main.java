package com.company;

import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        //Consumer<Payment> consumer = (payment) -> payment.doPayment();
        Consumer<Payment> consumer = (Payment::doPayment);

        consumer.accept(PaymentFactory.buildPayment(TypePayment.GOOGLEPAY));
        consumer.accept(PaymentFactory.buildPayment(TypePayment.CARD));

    }
}

/*
public class Main {
    public static void main(String[] args) {
        testFactoryMethod(TypePayment.GOOGLEPAY);
    }

    public static void testFactoryMethod(TypePayment typePayment) {  //ConcreteCreator
        Payment payment = PaymentFactory.buildPayment(typePayment);
        payment.doPayment();
    }
}
*/

