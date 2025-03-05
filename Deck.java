import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck; // List to store the deck of cards

    // Constructor initializes the deck by calling createDeck()
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Method to create a standard 52-card deck
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print all the cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card based on index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    // Method to find and display all cards of a given suit
    public void sameCard(String suit) {
        System.out.println("Cards from suit: " + suit);
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Method to find and display all cards with a given rank
    public void compareCard(String rank) {
        System.out.println("Cards with rank: " + rank);
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Method to search for a specific card in the deck
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    // Method to deal 5 random cards from the deck
    public void dealCard() {
        Collections.shuffle(deck); // Shuffle the deck before dealing
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
