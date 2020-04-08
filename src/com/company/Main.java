package com.company;

import com.company.behavioral.chainofresponsability.Tarjeta;
import com.company.behavioral.command.CreditCard;
import com.company.behavioral.command.CreditCardActivateCommand;
import com.company.behavioral.command.CreditCardDeactivateCommand;
import com.company.behavioral.command.CreditCardInvoker;
import com.company.creational.abstractfactory.AbstractFactory;
import com.company.creational.abstractfactory.Card;
import com.company.creational.abstractfactory.FactoryProvider;
import com.company.creational.abstractfactory.PaymentMethod;
import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;
import com.company.creational.prototype.PrototypeCard;
import com.company.creational.prototype.PrototypeFactory;

import static com.company.creational.prototype.PrototypeFactory.CarType.AMEX;
import static com.company.creational.prototype.PrototypeFactory.CarType.VISA;


public class Main {

    public static void main(String[] args) {

        //CREACIONALES
        //probarFactoryMethod();
        //probarAbstractFactoryMethod();
        //probarBuilder();
        //probarPrototype();
        //probarSinglenton();

        //COMPORTAMIENTOÇ
        //probarChainOfResponsability();
        probarCommand();
    }

    private static void probarCommand() {

        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDeactivate = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();

        System.out.println("---------------------------------------------------------------------");
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("---------------------------------------------------------------------");
        invoker.setCommand((new CreditCardDeactivateCommand(creditCardDeactivate)));
        invoker.run();
        System.out.println("---------------------------------------------------------------------");

    }

    private static void probarChainOfResponsability() {

        Tarjeta tarjeta = new Tarjeta();  //en este punto en lugar de esta instruccion, se puede usar un patrón creacional como probarFactoryMethod
        tarjeta.creditCardRequest(15);
    }

    private static void probarSinglenton() {

        //com.company.creational.singlenton.Card card = new com.company.creational.singlenton.Card();
        com.company.creational.singlenton.Card.getINSTANCE().setCardNumber("1234-1234-1234-1234");
        System.out.println(com.company.creational.singlenton.Card.getINSTANCE().getCardNumber());
    }

    private static void probarPrototype() {

        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void probarBuilder() {

        com.company.creational.builder.Card card = new com.company.creational.builder.Card.CardBuilder("VISA",
                "0000 1111 2222 3333")
                .name("Mauricio Ramirez")
                .expires(2030)
                .credit(true)
                .build();

        System.out.println(card);

        com.company.creational.builder.Card card2 = new com.company.creational.builder.Card.CardBuilder("AMEX",
                "9999 9999 9999 9999")
                .build();

        System.out.println(card2);
    }

    private static void probarAbstractFactoryMethod() {

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("Card");
        Card card = (Card) abstractFactory1.create("VISA");

        AbstractFactory abstractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create("DEBIT");

        System.out.println("Una tarjeta de tipo: " + card.getCardType() + " con el método de pago: " + paymentMethod.doPayment());
    }

    private static void probarFactoryMethod() {  //ConcreteCreator
        Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
        payment.doPayment();
    }
}

/*
public class Main {

    public static void main(String[] args) {

        Consumer<Payment> consumer = (Payment::doPayment); // (payment) -> payment.doPayment();
        consumer.accept(PaymentFactory.buildPayment(TypePayment.GOOGLEPAY));

        BiConsumer<AbstractFactory, AbstractFactory> biConsumer = (abstractFactory1, abstractFactory2) -> {

            Card card = (Card) abstractFactory1.create("VISA");
            PaymentMethod paymentMethod = (PaymentMethod) abstractFactory2.create("DEBIT");

            System.out.println("Una tarjeta de tipo: " + card.getCardType() + " con el metodo de pago: " + paymentMethod.doPayment());
        };

        biConsumer.accept(FactoryProvider.getFactory("Card"), FactoryProvider.getFactory("PaymentMethod"));
    }
}
 */


