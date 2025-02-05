public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("creating deck....");
        deck.createDeck();
        System.out.println("Displaying deck....");
        deck.displayDeck();
        System.out.println("Shuffling deck....");
        deck.shuffleDeck();
        deck.displayDeck();
    }

}
