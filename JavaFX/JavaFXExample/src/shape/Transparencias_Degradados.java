package shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Transparencias_Degradados extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group miGrupo = new Group();
		
		Rectangle rect1 = new Rectangle(0,75,350,40);
		rect1.setStroke(Color.BLACK);
		rect1.setFill(Color.rgb(255, 0, 0, 1.0)); //rellena el rectangulo
		rect1.setStrokeWidth(3); //grosor del trazo
		miGrupo.getChildren().add(rect1);
		
		//PARA CREAR EL DEGRADADO:
		LinearGradient deg1 = new LinearGradient(0,0,0,1,true, CycleMethod.NO_CYCLE, new Stop(0.0,Color.BLUE), new Stop(1.0, Color.RED));
		
		Rectangle rect2 = new Rectangle(50,5,100,200);
		rect2.setStroke(Color.BLACK);
		rect2.setFill(deg1); //rellena el rectangulo con el degradado
		rect2.setStrokeWidth(3); //grosor del trazo
		miGrupo.getChildren().add(rect2);
		
		Rectangle rect3 = new Rectangle(200,5,100,200);
		rect3.setStroke(Color.BLACK);
		rect3.setFill(Color.rgb(200, 200, 200, 0.5)); //rellena el rectangulo con transparencia
		rect3.setStrokeWidth(3); //grosor del trazo
		miGrupo.getChildren().add(rect3);
		
		Scene miScene = new Scene(miGrupo);
		
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Figuritas");
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
