package com.quatrephishing;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> handCards = null;

    Hand(String handValue) {
        handCards = handleInput(handValue);

    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Card> handCards) {
        this.handCards = handCards;
    }

    private List<Card> handleInput(String value){

        return null;
    }
}
