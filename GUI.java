/**
 * Created by flame on 4/19/2017.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {
    public GUI(){
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane computerPane = new GridPane();
        computerPane.setAlignment(Pos.CENTER);
        computerPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        computerPane.setHgap(5.5);
        computerPane.setVgap(5.5);

        Button newPile = new Button("New Pile");
        Button newHand = new Button("New Hands");

        computerPane.add(newPile,0,1);
        computerPane.add(newHand,0,2);

        Deck game = new Deck();
        Bot AI = new Bot();
        Person player = new Person();

        newPile.setOnAction(e -> game.addPile()
        );

        newHand.setOnAction(e ->{
            player.getHand();
            AI.getHand();
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