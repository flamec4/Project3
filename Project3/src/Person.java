
import java.util.LinkedList;

/**
 * Created by flame on 4/19/2017.
 */
public class Person {
    private LinkedList<Integer> deck;
    private int score = 0;
    private int count = 0;

    public Person(){
    }

    public Person(LinkedList<Integer> playedDeck){
        setplayedDeck(playedDeck);
    }

    public void setplayedDeck(LinkedList<Integer> thedeck){
        deck = thedeck;
    }

    public void NumberOfCardsInPile(Integer numofcards){
        count = count + numofcards;
    }
    public void setScore(Integer score){
        this.score = this.score + score;
    }
    public int getScore(){
        return score;
    }
    public int getNumOftheCards(){
        return count;
    }
    public Integer getSize(){
        return deck.size();
    }
    public LinkedList<Integer> getDeck(){
        return deck;
    }

    public Integer Play(int chosenCard){
        if(this instanceof Bot){
            int cardNumber = this.getDeck().get(chosenCard);
            this.getDeck().remove(chosenCard);
            return cardNumber;
        }
        else
        {
            int cardNumber = this.getDeck().get(chosenCard);
            this.getDeck().remove(chosenCard);
            return cardNumber;
        }
    }
    /*LinkedList<String> myhand = new LinkedList<>();
    LinkedList<String> fDeck = new LinkedList<>();
    LinkedList<Integer> mywinPile = new LinkedList<>();
    String topCard = "";
    int Score = 0;
    public Person(){

    }
    Person(LinkedList<String> deck) {
       this.fDeck = deck;
    }
    public void Play(Card card, Deck deck, Person player){
        deck.pile.add(0, card.locale);
        myhand.remove(0);
        Cap(deck, player);
    }

    public void draw(Deck deck){
        if(deck.deck.size() > 10){
            for(int i = 0; i < 4; i++)
                deck.dealHand();
        }
    }
    public void Cap(Deck deck, Person player) {
        boolean isCaped = deck.pile.get(0) == deck.pile.get(1);
        if(isCaped){
            if(deck.pile.size() == 2 && deck.pile.get(0) == deck.pile.get(1)){
                player.Score += 10;
                if (deck.pile.get(0).equals(11)){
                    player.Score += 10;
                }
            }
            while(deck.pile.size() != 0){
                if(deck.pile.get(0).equals(0)){

                }
            }
        }
    }

    public void takeTurn(){

    }*/
}

