package scene;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrabajoStack extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//STACKPANE UBICA LOS RECTANGULOS UNO DENTRO DEL OTRO
		
		
		Rectangle rec1 = new Rectangle(200,200);
		rec1.setFill(Color.RED);
		
		Rectangle rec2 = new Rectangle(100,100);
		rec2.setFill(Color.BLUE);
		
		Rectangle rec3 = new Rectangle(50,50);
		rec3.setFill(Color.GREEN);
		
		//El orden en que aparecen los rectangulos es el orden en que se ponen en el stack
		StackPane miStack = new StackPane(rec1, rec2, rec3);
		//Para cambiar la ubicacion de los rectangulos
		miStack.setAlignment(Pos.TOP_CENTER);
		//Darle un margen superior a todo el stack
		miStack.setPadding(new Insets(60));
		//Darle un margen superior a un rectangulo
		miStack.setMargin(rec3, new Insets(20));
		
		
		Scene miScene= new Scene(miStack,600,400);
		miScene.setFill(Color.YELLOW);
		
		primaryStage.setScene(miScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
