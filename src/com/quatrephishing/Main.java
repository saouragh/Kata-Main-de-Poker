package com.quatrephishing;

public class Main {

    public static void main(String[] args) {
      askForHands();
    }

    private static void askForHands(){
        System.out.println("Main 1 : ");
        String firstHand = System.console().readLine();

        Hand handOne = new Hand(firstHand);
    }
}
 