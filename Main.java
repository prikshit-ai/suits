import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(); // Creating a deck instance
        Scanner scanner = new Scanner(System.in);

        System.out.println("Displaying deck...");
        deck.printDeck(); // Display all cards in the deck

        System.out.println("\nShuffling deck...");
        deck.shuffleDeck(); // Shuffle the deck
        deck.printDeck(); // Display shuffled deck

        // Asking user for an index to display a specific card
        System.out.println("\nDisplaying a specific card (Enter index 0-51):");
        int index = scanner.nextInt();
        deck.printCard(index);

        // Asking user for a suit to display all cards of that suit
        System.out.println("\nEnter suit to display all cards from that suit:");
        scanner.nextLine(); // Consume the newline character
        String suit = scanner.nextLine();
        deck.sameCard(suit);

        // Asking user for a rank to display all matching cards
        System.out.println("\nEnter rank to find all matching cards:");
        String rank = scanner.nextLine();
        deck.compareCard(rank);

        // Asking user for a specific card to search
        System.out.println("\nEnter rank and suit to search for a specific card:");
        String searchRank = scanner.next();
        String searchSuit = scanner.next();
        deck.findCard(searchRank, searchSuit);

        // Dealing 5 random cards
        System.out.println("\nDealing 5 random cards...");
        deck.dealCard();
        
        scanner.close(); // Close scanner to prevent resource leak
    }
}
