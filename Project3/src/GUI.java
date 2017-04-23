/**
 * Created by flame on 4/19/2017.
 */
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;
public class GUI extends BorderPane {
        StackPane pane = new StackPane();
        StackPane remainingCards = new StackPane();
        HBox playerHand = new HBox(5);
        HBox botHand = new HBox(5);
        VBox back = new VBox(5);

        private Text SizeofDeck = new Text(Integer.toString(TheGame.deck.deck.size()));
        public Text yourCards = new Text("Player: " + TheGame.person.getNumOftheCards());
        public Text botCards = new Text("Bot: " + TheGame.bot.getNumOftheCards());
   /* public void start(Stage primaryStage) throws Exception {
        LinkedList<Integer> myDeck = new LinkedList<>();
        String top = "";
        Deck deck = new Deck(myDeck);
        Card card = new Card(1);
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        //Player's hand
        Person player = new Person();
        player.getDeck();

        //Bot's hand
        Bot bot = new Bot(myDeck);
        bot.getDeck();


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Pishti");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }*/
}