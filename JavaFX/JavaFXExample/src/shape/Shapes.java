package shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Shapes extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Line linea1 = null;
		Line linea2 = null;
		
		Group miGrupo = new Group();
		
		for(int i=0; i<300; i+=50) {
			linea1 = new Line(i, 0, i, 300);
			linea1.setStroke(Color.BLUE);
			
			linea2 = new Line(0, i, 300, i);
			linea2.setStroke(Color.RED);
			
			miGrupo.getChildren().addAll(linea1,linea2);
			
		}
		
		FlowPane miPane = new FlowPane(miGrupo);
		
		Scene miScene = new Scene(miPane);
		
		primaryStage.setScene(miScene);
		primaryStage.show();
				
	}

	public static void main(String[] args) {
		launch(args);
	}
}
