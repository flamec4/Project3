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

    }
    public void makeDeck(){
        for (int i = 1; i < 53; i++) {
            this.deck.add("card/" + i + ".png");
        }
        deck2 = deck;
        java.util.Collections.shuffle(this.deck);
    }

    public String[] addPile(){
        String[] pilec = new String[4];
        for (int i = 0; i < 4; i++) {
            this.pile.add(this.deck.getFirst());
            pilec[i] = this.deck.getFirst();
            this.deck.removeFirst();
        }
        return pilec;
    }

    public LinkedList<String> giveDeck(){
        return deck2;
    }


    public String[] dealHand() {

            String[] playHand = new String[4];
            for(int i = 0; i < 4; i++){
                playHand[i] = this.deck.getFirst();
                this.deck.removeFirst();
            }

            return playHand;
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