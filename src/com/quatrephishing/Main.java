package com.quatrephishing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      askForHands();
    }

    private void askForHands(){
        System.out.println("Entrez la première main : ");
        String firstHand = System.console().readLine();

        Hand handOne = new Hand(firstHand);
    }
}
 