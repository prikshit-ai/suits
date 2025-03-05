import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    public void sameCard(String suit) {
        System.out.println("Cards from suit: " + suit);
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    public void compareCard(String rank) {
        System.out.println("Cards with rank: " + rank);
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
