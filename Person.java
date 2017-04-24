import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by flame on 4/19/2017.
 */


public class Person extends Deck {


    LinkedList<String> myHand = new LinkedList<>();
    ArrayList<String> myCards = new ArrayList<>();
    int Score = 0;

    Person(){
    }

    Person(LinkedList<String> playHand) {
        super(playHand);
    }


    public void Play(Card myCard, Deck myDeck){

    }

    public String takeTurn(){
        String cardOption = "";



        return cardOption;
    }
}

