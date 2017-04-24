/**
 * Created by flame on 4/19/2017.
 */
//Only 2 players, bot and player
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Deck extends GUI {


    LinkedList<String> deck = new LinkedList<>();
    LinkedList<String> pile = new LinkedList<>();
    LinkedList<String> deck2 = deck;
    
    LinkedList<String> playHand = new LinkedList<>();


    String top = "";

    Deck(){
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


    public void dealHand() {

        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < 4; i++) {
                playHand[p][i] = deck.getFirst();
                this.deck.removeFirst();
            }

        }
    }


    public void topCard(){
        top = pile.getFirst();
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