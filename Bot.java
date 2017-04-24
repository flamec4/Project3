import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Darren on 4/19/2017.
 */
public class Bot extends Person {

    LinkedList<String> myHand = new LinkedList<>();
    LinkedList<String> winPile = new LinkedList<>();
    LinkedList<String> fDeck = new LinkedList<>();
    String topCard = "";

    Bot(){
    }



    public String takeTurn(String[][] botHand,String topCard){

        myHand.addAll(Arrays.asList(botHand[0]).subList(0, 4));


        Scanner topScan = new Scanner(topCard).useDelimiter("[^0-9]+");
        int currentCard = topScan.nextInt();
        int[] inHand = new int[4];

        for(int i = 0; i < 4; i++){
            Scanner cardScan = new Scanner(myHand.get(i)).useDelimiter("[^0-9]+");
            inHand[i] = cardScan.nextInt();
        }

        String cardChoice = "";
        for(int j = 0; j < 4; j++){
            if(inHand[j]%13 == currentCard%13){
                cardChoice = myHand.get(j);
               winPile = super.wonPile(myHand.get(j));
            }
            else if(inHand[j]%13 == 11 ){
                cardChoice = myHand.get(j);
               winPile = super.wonPile(myHand.get(j));
            }
            else if(j == 3){
                cardChoice = myHand.get(j);
                super.discard(myHand.get(j));
            }
        }
        return cardChoice;
    }




}
