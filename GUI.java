/**
 * Created by flame on 4/19/2017.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
    public GUI(){
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //final String[] cards2;
        GridPane computerPane = new GridPane();
        computerPane.setAlignment(Pos.CENTER);
        computerPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        computerPane.setHgap(5.5);
        computerPane.setVgap(5.5);


        Button newPile = new Button("New Pile");
        Button newHandBot = new Button("New Hands");
        Button makeDeck = new Button("Make Deck");
        Button addPoints = new Button("Add Points Up");

        computerPane.add(newPile,0,1);
        computerPane.add(newHandBot,0,2);
        computerPane.add(makeDeck,0,3);
        computerPane.add(addPoints,0,4);

        Deck game = new Deck();
        Bot AI = new Bot();
        Person player = new Person();

        newPile.setOnAction(e -> {
            String[] cards = game.addPile();
            for(int i = 0; i < 4; i++) {
                computerPane.add(new ImageView(cards[i]),1,i);
            }
            game.topCard();
        });

        newHandBot.setOnAction(e ->{
            String[][] cards = new String[2][4];
            cards = game.playHand;
            for(int p = 0; p < 4;p++){
                computerPane.add(new ImageView(cards[0][p]),3,p);
            }

        });

        makeDeck.setOnAction(e ->{
            game.makeDeck();
        });

        addPoints.setOnAction(e -> {
            game.dealHand();
            game.topCard();
            AI.takeTurn(game.playHand,game.top);
        });


        Scene Calculate = new Scene(computerPane);
        primaryStage.setTitle("CardGame");
        primaryStage.setScene(Calculate);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}