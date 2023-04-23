package shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Efectos_Especiales extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//CLASS EFFECT
		Rectangle rect1 = new Rectangle(50,50,100,100);
		rect1.setFill(Color.LIGHTGRAY);
		rect1.setStroke(Color.BLACK);
		rect1.setStrokeWidth(3);
		
		//poner sombra al cuadrado
		DropShadow sombra1 = new DropShadow();
		rect1.setEffect(sombra1);
		sombra1.setOffsetX(15); //tamaño de la sombra en x
		sombra1.setOffsetY(15); //tamaño de la sombra en y
		
		Group miGrupo = new Group();
		miGrupo.getChildren().add(rect1);
		
		Scene miScene = new Scene(miGrupo);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Efectos");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
