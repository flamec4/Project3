/**
 * Created by flame on 4/23/2017.
 */
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;
public class TheGame {
    public static Person person;
    public static Bot bot;
    public static GUI gui;
    public static Deck deck;

    public static void main(String[]args){
        LinkedList<Integer> playerDeck = new LinkedList<>();
        LinkedList<Integer> botDeck = new LinkedList<>();
        LinkedList<Integer> pile = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();
        deck.Shuffle();

        //Player's Cards
        deck.dealHandPerson();
        Person player = new Person(playerDeck);

        //Bot's Cards
        deck.dealHandBot();
        Bot bot = new Bot();

        //Put the deck on the pile
        Pile pile1 = new Pile(pile);
    }
    public static void Play(int p, Person player, LinkedList<Integer> playerDeck, Pile pile){
        //If-Else to add to discard pile depending on who went
        if(player instanceof Bot){
            Integer playedCard = player.Play(p);
            pile.AddtoPile(p);
        }
        else
        {

            Integer playedCard = player.Play(p);
            pile.AddtoPile(playedCard);
        }
    }
    public static LinkedList<Integer> Deal(LinkedList<Integer> theDeck){
        if((deck.returnMyDeck().get(3)) % 13 == 11){
            deck.Shuffle();
            Deal(theDeck);
        }
        else
        {
            //deal again
            Deal(theDeck);
        }
        return theDeck;
    }
}
