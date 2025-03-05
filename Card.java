public class Card {
    private String rank; // Rank of the card (e.g., 2, 3, J, Q, K, A)
    private String suit; // Suit of the card (Hearts, Diamonds, Clubs, Spades)

    // Constructor to initialize card properties
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter method for rank
    public String getRank() {
        return rank;
    }

    // Getter method for suit
    public String getSuit() {
        return suit;
    }

    // Method to return card as a readable string
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
