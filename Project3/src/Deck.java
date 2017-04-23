/**
 * Created by flame on 4/19/2017.
 */
//Only 2 players, bot and player
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private Random randomGen = new Random();
    LinkedList<Integer> deck = new LinkedList<>();
    LinkedList<Integer> pile = new LinkedList<>();
    String top = "";
    Deck() {
        for (int i = 1; i < 53; i++) {
            Card CardDraw = new Card(i);
            CardDraw.num = i;
            this.deck.add(CardDraw.locale.indexOf(i));
        }
        for (int i = 0; i < 4; i++) {
            this.pile.add(this.deck.get(i));
            this.deck.remove(i);
        }
    }
    public void Shuffle(){
        java.util.Collections.shuffle(deck);
    }

    //Bot kingBot = new Bot(deck);
   // Person kingPerson = new Person(deck);

    public void dealHandBot() {
        for (int i = 0; i < 4; i++) {
            int index = randomGen.nextInt(deck.size());
            //kingBot.myHand.add(deck.get(index));
            deck.remove(index);
            if (deck.get(index) == null) {
                dealHandBot();
            }
        }
    }
    public void dealHandPerson(){
        for(int i = 0; i < 4; i++){
            int index = randomGen.nextInt(deck.size());
            //kingPerson.add(deck.get(index));
            deck.remove(index);
            if(deck.get(index)== null){
                dealHandPerson();
            }
        }
    }
    public LinkedList<Integer> returnMyDeck(){
        return deck;
    }

    public void end(){
        System.out.println("Game Over!");
    }
}