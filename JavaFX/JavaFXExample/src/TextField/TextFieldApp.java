package TextField;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextFieldApp extends Application {
	
	TextField txtEquipo, txtJugador, txtPuntos;
	
	@Override
	public void start(Stage primaryStage) {
		
		//ETIQUETA DEL EQUIPO
		Label lbEquipo = new Label("Nombre del equipo: ");
		lbEquipo.setMinWidth(100);
		lbEquipo.setAlignment(Pos.BOTTOM_RIGHT);
		
		//CAMPO DE TEXTO DEL EQUIPO
		txtEquipo = new TextField();
		txtEquipo.setMinWidth(200);
		txtEquipo.setMaxWidth(200);
		txtEquipo.setPromptText("Nombre del equipo");
		
		//ETIQUETA DEL JUGADOR
		Label lbJugador = new Label("Nombre del jugador: ");
		lbJugador.setMinWidth(100);
		lbJugador.setAlignment(Pos.BOTTOM_RIGHT);
				
		//CAMPO DE TEXTO DEL JUGADOR
		txtJugador = new TextField();
		txtJugador.setMinWidth(200);
		txtJugador.setMaxWidth(200);
		txtJugador.setPromptText("Nombre del jugador");
				
		//ETIQUETA DE LOS PUNTOS
		Label lbPuntos = new Label("Numero de puntos: ");
		lbPuntos.setMinWidth(100);
		lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
				
		//CAMPO DE TEXTO DE LOS PUNTOS
		txtPuntos = new TextField();
		txtPuntos.setMinWidth(200);
		txtPuntos.setMaxWidth(200);
		txtPuntos.setPromptText("Numero de puntos");
		
		//BOTON
		Button botonGuardar = new Button("Guardar");
		botonGuardar.setMinWidth(80);
		botonGuardar.setMaxWidth(80);
		botonGuardar.setOnAction(e -> botonGuardarClick());
		
		//CREACION DE LOS PANE
		HBox paneEquipo = new HBox(20, lbEquipo,txtEquipo);
		paneEquipo.setPadding(new Insets(10));
		
		HBox paneJugador = new HBox(20, lbJugador,txtJugador);
		paneJugador.setPadding(new Insets(10));
		
		HBox panePuntos = new HBox(20, lbPuntos,txtPuntos);
		panePuntos.setPadding(new Insets(10));
		
		HBox paneBoton = new HBox(20, botonGuardar);
		paneBoton.setPadding(new Insets(10));
		paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
		
		// CREACION DEL VBOX
		VBox panelVertical = new VBox(10, paneEquipo, paneJugador, panePuntos, paneBoton);
		
		//CREAMOS LA ESCENA
		Scene miScene = new Scene(panelVertical);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Datos del jugador");
		primaryStage.show();

	}

	private void botonGuardarClick() {
		
		String mensaje = "";
		
		if(txtEquipo.getText().length()==0) mensaje+= "\nEl nombre del equipo es requerido";
		if(txtJugador.getText().length()==0) mensaje+= "\nEl nombre del jugador es requerido";
		if(txtPuntos.getText().length()==0) mensaje+= "\nLos puntos del jugador son requeridos";
		if(mensaje.length()==0) {
			
			if(comprobarEntero(txtPuntos, "Debes introducir un valor numerico entero")) {
					mensaje = "El jugador " + txtJugador.getText() + " que juega en " + txtEquipo.getText() +
								" anota " + txtPuntos.getText() + " puntos por partido.";
			
					VentanaEmergente.mostrar(mensaje,  "Datos del jugador");
			
			}
			else{txtPuntos.requestFocus();} //PARA QUE VUELVA EL FOCO EN CASO DE QUE SEA ERRONEO
			
		}else {
			VentanaEmergente.mostrar(mensaje, "Faltan datos!!");
		}
		
		
	}
	
	private boolean comprobarEntero(TextField f, String mensaje) {
		
		try {
			Integer.parseInt(f.getText());
			
			return true;
			
		}catch(NumberFormatException e) {
			VentanaEmergente.mostrar(mensaje,  "Datos incorrectos");
			
			
			return false;
			
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
