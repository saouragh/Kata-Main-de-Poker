package com.quatrephishing;


public class Hand {

    private List<Carte> handCards = null;

    public Hand(String handValue) {
        handCards = handleInput(handValue);
    }

    public List<Carte> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<Carte> handCards) {
        this.handCards = handCards;
    }

    private List<Carte> handleInput(String value){
        handCards = new ArrayList<Carte>();

    }
}
