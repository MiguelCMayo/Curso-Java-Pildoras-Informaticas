package application;

import emergente.VentanaDialogo;
import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SalirdeAplicacion extends Application {
	
	Stage miStage;
	int contadorDeClics;

	@Override
	public void start(Stage primaryStage) {
		
		miStage = primaryStage;
		
		Button botonClic = new Button();
		botonClic.setText("Pulsar");
		botonClic.setOnAction(e->hazmeClic());
		
		Button botonCerrar = new Button();
		botonCerrar.setText("Cerrar");
		botonCerrar.setOnAction(e->botonCerrar());
		
		HBox miPane = new HBox(10);
		miPane.getChildren().addAll(botonClic,botonCerrar);
		miPane.setAlignment(Pos.CENTER); //Pone los botones en el centro
		
		Scene miScene = new Scene(miPane,350,200);
		
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Contador de clics");
		
		primaryStage.setOnCloseRequest(e->{
			e.consume();
			botonCerrar();
			}); //Si pulsas la x te pregunta si quieres salir
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void hazmeClic() {
		
		contadorDeClics++;
		
		if(contadorDeClics == 1) VentanaEmergente.mostrar("Has hecho clic una vez", "Clic!");
		else VentanaEmergente.mostrar("Has hecho clic " + contadorDeClics + " veces", "Clic!");
	}
	
	public void botonCerrar() {
		
		boolean confirmar = false;
		confirmar = VentanaDialogo.mostrar("Estas seguro de salir?", "Saliendo...");
		
		if(confirmar) {
			//Aqui irian todas las tareas antes cerrar
			miStage.close();
		}
	}
}
