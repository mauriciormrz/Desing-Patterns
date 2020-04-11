package com.company;

import com.company.behavioral.chainofresponsability.Tarjeta;
import com.company.behavioral.command.CreditCard;
import com.company.behavioral.command.CreditCardActivateCommand;
import com.company.behavioral.command.CreditCardDeactivateCommand;
import com.company.behavioral.command.CreditCardInvoker;
import com.company.behavioral.interpreter.Expression;
import com.company.behavioral.interpreter.TerminalExpresion;
import com.company.behavioral.interpreter.andExpression;
import com.company.behavioral.interpreter.orExpression;
import com.company.behavioral.iterator.CardList;
import com.company.behavioral.iterator.Iterator;
import com.company.behavioral.iterator.List;
import com.company.behavioral.mediator.ConcreteColleague1;
import com.company.behavioral.mediator.ConcreteColleague2;
import com.company.behavioral.mediator.ConcreteMediator;
import com.company.behavioral.memento.Article;
import com.company.behavioral.memento.ArticleMemento;
import com.company.behavioral.memento.Caretaker;
import com.company.behavioral.observer.Coche;
import com.company.behavioral.observer.MessagePublisher;
import com.company.behavioral.observer.Peaton;
import com.company.behavioral.observer.Semaforo;
import com.company.behavioral.state.MobileAlertStateContext;
import com.company.behavioral.state.Silent;
import com.company.behavioral.state.Vibration;
import com.company.behavioral.strategy.CapitalStrategyTextFormatter;
import com.company.behavioral.strategy.Context;
import com.company.behavioral.strategy.LowerStrategyTextFormatter;
import com.company.behavioral.templatemethod.PayPal;
import com.company.behavioral.templatemethod.Visa;
import com.company.behavioral.visitor.*;
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
        //probarCommand();
        //probarIterator();
        //probarMediator();
        //probarMemento();
        //probarObserver();
        //probarState();
        //probarInterprter();
        //probarStrategy();
        //probarTemplateMethod();
        probarVisitor();
    }

    private static void probarVisitor(){

        OfertaElemento ofertaElemento = new OfertaGasolina();
        ofertaElemento.accept(new BlackCreditCardVisitor());

        ofertaElemento = new OfertaVuelos();
        ofertaElemento.accept((new ClassicCreditCardVisitor()));
    }


    private static void probarTemplateMethod() {

        com.company.behavioral.templatemethod.Payment payment = new Visa();
        payment.makePayment();

        payment = new PayPal();
        payment.makePayment();
    }

    private static void probarStrategy() {

        Context context = new Context(new CapitalStrategyTextFormatter());
        context.publishText("Este texto será convertido todo a MAYÚSCULAS a través del algoritmo");

        context = new Context(new LowerStrategyTextFormatter());
        context.publishText("Este texto SERA CONVERTIDO todo a MINUSCULAS a través del algoritmo");
    }

    private static void probarInterprter() {

        Expression cero = new TerminalExpresion("0");
        Expression uno = new TerminalExpresion("1");

        Expression  containBoolean = new orExpression(cero, uno);
        Expression  containOneAndCero = new andExpression(cero, uno);

        System.out.println(containBoolean.interpret("cero"));
        System.out.println(containBoolean.interpret("0"));

        System.out.println(containOneAndCero.interpret("0"));
        System.out.println(containOneAndCero.interpret("0,1"));
    }

    private static void probarState() {

        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();

        context.setState(new Vibration());
        context.alert();
        context.alert();

        context.setState(new Silent());
        context.alert();
        context.alert();

    }

    private static void probarObserver() {

        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));

    }
    private static void probarMemento() {

        Caretaker caretaker = new Caretaker();
        Article article = new Article("Mauricio", "Memento es una película");
        article.setText(article.getText() + " de Nolan");
        System.out.println(article.getText());

        caretaker.addMemento(article.createMemento());
        article.setText(article.getText() + " protagonizada por Guy Pearce");
        System.out.println(article.getText());

        caretaker.addMemento(article.createMemento());
        article.setText(article.getText() + " y Leonardo DiCaprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = caretaker.getMemento(0);
        ArticleMemento memento2 = caretaker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());

        article.restoreMemento(memento2);
        System.out.println(article.getText());



    }

    private static void probarMediator() {

        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 user1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 user2 = new ConcreteColleague2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy user1");
        user2.send("Hola user1, soy user2");
    }

    private static void probarIterator() {

        com.company.behavioral.iterator.Card[] cards =  new com.company.behavioral.iterator.Card[5];
        cards[0] = new com.company.behavioral.iterator.Card("VISA");
        cards[1] = new com.company.behavioral.iterator.Card("AMEX");
        cards[2] = new com.company.behavioral.iterator.Card("MASTER CARD");
        cards[3] = new com.company.behavioral.iterator.Card("GOOGLE CARD");
        cards[4] = new com.company.behavioral.iterator.Card("APPLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while (iterator.hasNext()){

            com.company.behavioral.iterator.Card tarjeta = (com.company.behavioral.iterator.Card) iterator.next();
            System.out.println(tarjeta.getType());
        }

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


