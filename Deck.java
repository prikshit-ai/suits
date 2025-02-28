import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    ArrayList<Card> deck;
    public Deck(){
        deck = new ArrayList<>();

    }
    public void createDeck(){
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        for(String rank : ranks){
            for(String suit : suits){
                deck.add(new Card(rank,suit));
            }
        }
    }
    public void displayDeck(){
        for(Card card : deck){
            System.out.println(card);
        }
    }   
    public void shuffleDeck(){
        Collections.shuffle(deck);

    }
    public void randomCards(){
        Collections.shuffle(deck);
        for (int i = 0; i < 2; i++) {
            System.out.println("random card :" +deck.get(i));
        }
    }
    public void cardPlayers(){
        for (int j = 0; j < 3; j++) {
            
        
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(deck);
            System.out.println("Player "+(j+1)+ "gets card :" +deck.get(i));
            
        }
        System.out.println();
    }
    }
}
