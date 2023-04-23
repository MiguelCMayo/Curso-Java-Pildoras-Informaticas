package scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TrabajoAnchor extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//CREAMOS LOS BOTONES Y ESTABLECER LA POSICION DE LOS BOTONES
		Button topButton = new Button("Top");
		AnchorPane.setTopAnchor(topButton, 10.0);
		AnchorPane.setLeftAnchor(topButton, 60.0);
		AnchorPane.setRightAnchor(topButton, 60.0);
		
		Button leftButton = new Button("Left");
		AnchorPane.setTopAnchor(leftButton, 60.0);
		AnchorPane.setLeftAnchor(leftButton, 10.0);
		AnchorPane.setBottomAnchor(leftButton, 60.0);
		
		Button rightButton = new Button("Right");
		AnchorPane.setTopAnchor(rightButton, 60.0);
		AnchorPane.setRightAnchor(rightButton, 10.0);
		AnchorPane.setBottomAnchor(rightButton, 60.0);
		
		Button bottomButton = new Button("Bottom");
		AnchorPane.setBottomAnchor(bottomButton, 10.0);
		AnchorPane.setRightAnchor(bottomButton, 60.0);
		AnchorPane.setLeftAnchor(bottomButton, 60.0);

		//CREAMOS EL ANCHORPANE
		AnchorPane miAnchor = new AnchorPane(topButton,leftButton,rightButton,bottomButton);
		
		Scene miScene = new Scene(miAnchor);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Ejemplo de AnchorPane");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
