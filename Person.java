import java.util.ArrayList;

/**
 * Created by flame on 4/19/2017.
 */


public class Person extends Deck {


    ArrayList<String> myHand = new ArrayList<>();
    ArrayList<String> myCards = new ArrayList<>();
    int Score = 0;


    Person() {
    }

    public void getHand(){
        for(int i = 0; i < 4; i++){
            myHand.add(super.dealHand());
        }
    }

    public void Play(Card myCard, Deck myDeck){

    }

    public String takeTurn(){
        String cardOption = "";



        return cardOption;
    }
}

