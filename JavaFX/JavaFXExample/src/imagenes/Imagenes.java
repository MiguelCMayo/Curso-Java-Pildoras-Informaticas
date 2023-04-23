package imagenes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Imagenes extends Application {

	@Override
	public void start(Stage primaryStage) {
		//INSERTAR PRIMERA IMAGEN
		Image img1 = new Image ("C:\\Users\\Miguel\\Desktop\\Java\\Pildoras Informaticas\\JavaFX\\Imagenes ejemplo\\playa1.jpg");
		ImageView miImagen1 = new ImageView(img1);
		miImagen1.setFitWidth(600);
		miImagen1.setPreserveRatio(true); //Guardar las proporciones de la imagen
		
		//EFECTOS EN LA IMAGEN
		MotionBlur blur = new MotionBlur();
		blur.setRadius(30);
		blur.setAngle(170);
		miImagen1.setEffect(blur);
		
		//INSERTAR SEGUNDA IMAGEN
		Image img2 = new Image ("C:\\Users\\Miguel\\Desktop\\Java\\Pildoras Informaticas\\JavaFX\\Imagenes ejemplo\\playa2.jpg");
		ImageView miImagen2 = new ImageView(img2);
		miImagen2.setFitWidth(600);
		miImagen2.setPreserveRatio(true); //Guardar las proporciones de la imagen
		
		HBox panelHorizontal = new HBox(miImagen1,miImagen2);
		panelHorizontal.setPadding(new Insets(10,10,10,10));
		panelHorizontal.setSpacing(10);
		
		Scene miScene = new Scene(panelHorizontal);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Imagenes");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
