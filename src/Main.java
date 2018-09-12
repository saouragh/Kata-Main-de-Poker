public class Main {

    public static void main(String[] args) {
      askForHands();
    }

    private void askForHands(){
        System.out.println("Entrez la première main : ");
        String firstHand = System.console().readLine();

        System.out.println("\n Entrez la deuxième main : ");
        String secondHand = System.console().readLine();

        Hand handOne = new Hand(firstHand);
        Hand handTwo = new Hand(secondHand);
    }
}
