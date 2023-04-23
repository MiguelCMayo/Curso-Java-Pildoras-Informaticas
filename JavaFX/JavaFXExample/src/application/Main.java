package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import emergente.*;


public class Main extends Application {
	
	private Label miTexto = new Label();
	private int contador;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {

			contador = 0;
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Label miLabel = new Label();
			//miLabel.setText(mensaje);
			
			Button miBotonPulsa_clicked = new Button();
			miBotonPulsa_clicked.setText("SI");
			miBotonPulsa_clicked.setOnAction(e->miBotonPulsa_clicked());
			
			Button miBotonCerrar_clicked = new Button();
			miBotonCerrar_clicked.setText("No");
			miBotonCerrar_clicked.setOnAction(e->miBotonCerrar_clicked());
			
			HBox panelBotones = new HBox(20);
			panelBotones.getChildren().addAll(miBotonPulsa_clicked,miBotonCerrar_clicked);
			panelBotones.setAlignment(Pos.CENTER); //Pone los botones en el centro
			
			VBox panelVertical = new VBox(20);
			panelVertical.getChildren().addAll(miLabel,panelBotones);
			panelVertical.setAlignment(Pos.CENTER); //Pone el texto en el centro
			
			//Scene miScene = new Scene(panelVertical,200,150);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void miBotonPulsa_clicked() {
		
		boolean resultado = VentanaDialogo.mostrar("Esta e nuestra ventana emergente", "Ojo cuidado");
		
		System.out.println(resultado);
	}
	
	private static void miBotonCerrar_clicked() {

	}
	
	
}
