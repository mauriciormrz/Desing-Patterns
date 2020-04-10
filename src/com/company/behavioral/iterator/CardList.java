package com.company.behavioral.iterator;

public class CardList implements List { //ConcreteAggregate

    private Card[] cards;

    public CardList(Card[] cards){

        this.cards = cards;
    }

    @Override
    public Iterator iterator() {

        return new CardIterator(cards);
    }
}
