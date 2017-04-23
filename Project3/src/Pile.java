/**
 * Created by flame on 4/23/2017.
 */
import java.util.LinkedList;
public class Pile {
    private LinkedList<Integer> pile;
    int myScore = 0;
    public Pile(LinkedList<Integer> myCards){
        pile = myCards;
    }
    public LinkedList<Integer> getPile(){
        return pile;
    }
    public Integer CalculatePoints() {
        //Checks for certain cards as to per rules and adds the points together
        if (pile.size() == 2) {
            if (pile.size() - 1 % 13 == 11 && pile.size() - 2 % 13 == 11) {
                myScore += 20;
            }
            else if (pile.size() - 1 % 13 == pile.size() - 2 % 13) {
                myScore += 10;
            }
        }
        int count = 0;
        while (count < pile.size()) {
            if (pile.get(count) == 36) {
                myScore += 3;
            }
            else if (pile.get(count) == 41) {
                myScore += 2;
            }
            else if (pile.get(count) % 13 == 1 || (pile.get(count) % 13 == 10) || pile.get(count) % 13 == 11 || (pile.get(count) % 13 == 12) || pile.get(count) == 0) {
                myScore++;
            }
            count++;
        }
        return myScore;
    }

    public boolean isFin(){
    if(pile.size() > 1) {
        if(pile.size() - 1 % 13 == pile.size() - 2 % 13 || pile.size() - 1 % 13 == 11){
            return true;
        }
        else
        {
            return false;
        }

    }
    else
    {
        return false;
    }
    }
    public void AddtoPile(Integer currentCard){
    pile.add(currentCard);
    }
}
