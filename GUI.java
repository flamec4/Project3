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
        Button newHand = new Button("New Hands");
        Button makeDeck = new Button("Make Deck");

        computerPane.add(newPile,0,1);
        computerPane.add(newHand,0,2);
        computerPane.add(makeDeck,0,3);

        Deck game = new Deck();
        Bot AI = new Bot();
        Person player = new Person();

        newPile.setOnAction(e -> {
            String[] cards = game.addPile();
            for(int i = 0; i < 4; i++) {
                computerPane.add(new ImageView(cards[i]),1,i);
            }

        });

        newHand.setOnAction(e ->{
            String[] cards2 = AI.getHand();
            for(int i = 0; i < 4;i++){
                computerPane.add(new ImageView(cards2[i]),2,i);
            }

        });

        makeDeck.setOnAction(e ->{
            game.makeDeck();
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