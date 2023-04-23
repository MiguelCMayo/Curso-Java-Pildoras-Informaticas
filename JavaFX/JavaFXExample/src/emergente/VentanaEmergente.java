package emergente;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaEmergente {
	
	public static void mostrar(String mensaje, String titulo) {
		
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL); //Una ventana modal es la que se queda siempre visible y no pasa atras
		miStage.setTitle(titulo);
		miStage.setMinWidth(250);
		
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		miBoton.setOnAction(e->miStage.close());
		
		BorderPane miPane = new BorderPane();
		
		Scene miScene = new Scene(miPane, 600, 200);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		miStage.showAndWait();
		
	}

}
