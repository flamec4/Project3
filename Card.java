import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Created by flame on 4/19/2017.
 */

public class Card {
    public int num;
    public int suit;
    public String locale;
    public ImageView myImage;
    public ImageView BackOfCard;

    public Card(int num) {
        this.num = num;
        this.locale = "cards/" + num + ".png";
        this.myImage = new ImageView(new Image(locale));

        this.suit = ((num - 1) / 13) % 4;
        this.num = num % 13;
        BackOfCard = new ImageView(new Image("card/200px-Card_back-Lunar_New_Year.png"));
    }
}
