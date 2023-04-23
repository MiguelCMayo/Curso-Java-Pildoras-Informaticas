package shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Dibujando_Texto extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//crear degradado
		LinearGradient deg1 = new LinearGradient(0,0,0,1,true, CycleMethod.NO_CYCLE, new Stop(0.0,Color.BLUE), new Stop(1.0, Color.RED));
		
		//crear texto
		Text texto1 = new Text(100,250,"Hola alumnos");
		
		texto1.setFont(new Font("Times New Roman", 200));
		texto1.setStroke(Color.BLACK); //color del borde del texto
		texto1.setFill(deg1); //rellena el texto con el degradado
		texto1.setStrokeWidth(3);
		
		Group miGrupo = new Group();
		miGrupo.getChildren().add(texto1);
		
		Scene miScene = new Scene(miGrupo);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Trabajo con textos");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
