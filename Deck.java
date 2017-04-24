/**
 * Created by flame on 4/19/2017.
 */
//Only 2 players, bot and player
import java.util.LinkedList;
import java.util.Random;

public class Deck extends GUI {


    private Random randomGen = new Random();
    LinkedList<String> deck = new LinkedList<>();
    LinkedList<String> pile = new LinkedList<>();
    LinkedList<String> deck2 = deck;
    String top = "";

    Deck() {
        for (int i = 1; i < 53; i++) {
            this.deck.add("card/" + i + ".png");
        }
        deck2 = deck;
    }

    public void addPile(){
        java.util.Collections.shuffle(this.deck);
        for (int i = 0; i < 4; i++) {
            this.pile.add(this.deck.get(i));
            this.deck.remove(i);
        }
    }

    public LinkedList<String> giveDeck(){
        return deck2;
    }


    public String dealHand() {
            int index = randomGen.nextInt(deck.size());
            deck.remove(index);
            if (deck.get(index) == null) {
                dealHand();
            }
            return deck.get(index);

    }

    public String topCard(){
        top = pile.getFirst();
        return top;
    }

    public LinkedList<String> wonPile(String wCard){
        LinkedList<String> pileClone;
        pile.add(wCard);
        pileClone = pile;
        pile.clear();

        return  pileClone;
    }



    public void discard(String card){
        pile.add(card);
    }

    public void end(){
        System.out.println("Game Over!");
    }
}