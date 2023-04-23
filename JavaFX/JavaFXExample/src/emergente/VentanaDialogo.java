package emergente;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaDialogo {
	
	private static Stage miStage;
	private static boolean botonSiPulsado;
	
	public static boolean mostrar(String mensaje, String titulo) {
		
		botonSiPulsado=false;
		
		miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL); //Una ventana modal es la que se queda siempre visible y no pasa atras
		miStage.setTitle(titulo);
		miStage.setMinWidth(250);
		
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBotonSi = new Button();
		miBotonSi.setText("SI");
		miBotonSi.setOnAction(e->miBotonSi_clicked());
		
		Button miBotonNo = new Button();
		miBotonNo.setText("No");
		miBotonNo.setOnAction(e->miBotonNo_clicked());
		
		HBox panelBotones = new HBox(20);
		panelBotones.getChildren().addAll(miBotonSi,miBotonNo);
		panelBotones.setAlignment(Pos.CENTER); //Pone los botones en el centro
		
		VBox panelVertical = new VBox(20);
		panelVertical.getChildren().addAll(miLabel,panelBotones);
		panelVertical.setAlignment(Pos.CENTER); //Pone el texto en el centro
		
		Scene miScene = new Scene(panelVertical,200,150);
		
		miStage.setScene(miScene);
		miStage.showAndWait();
		
		return botonSiPulsado;
		
	}

	private static void miBotonNo_clicked() {
		miStage.close();
		
		botonSiPulsado=false;
	}

	private static void miBotonSi_clicked() {
		miStage.close();
		
		botonSiPulsado=true;
	}

	
	

}
