import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Displaying deck...");
        deck.printDeck();

        System.out.println("\nShuffling deck...");
        deck.shuffleDeck();
        deck.printDeck();

        System.out.println("\nDisplaying a specific card (Enter index 0-51):");
        int index = scanner.nextInt();
        deck.printCard(index);

        System.out.println("\nEnter suit to display all cards from that suit:");
        scanner.nextLine();
        String suit = scanner.nextLine();
        deck.sameCard(suit);

        System.out.println("\nEnter rank to find all matching cards:");
        String rank = scanner.nextLine();
        deck.compareCard(rank);

        System.out.println("\nEnter rank and suit to search for a specific card:");
        String searchRank = scanner.next();
        String searchSuit = scanner.next();
        deck.findCard(searchRank, searchSuit);

        System.out.println("\nDealing 5 random cards...");
        deck.dealCard();
        
        scanner.close();
    }
}
