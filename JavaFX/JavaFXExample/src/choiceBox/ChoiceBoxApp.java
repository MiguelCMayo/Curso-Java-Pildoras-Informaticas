package choiceBox;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChoiceBoxApp extends Application {
	
	ChoiceBox <JugadoresObj> jugadores= new ChoiceBox();
	
	@Override
	public void start(Stage primaryStage) {
		
		//CREAR CHOICEBOX
		jugadores= new ChoiceBox();
		JugadoresObj jugador1= new JugadoresObj("Miguel", "Castellanos");
		JugadoresObj jugador2= new JugadoresObj("Ana", "Perez");
		JugadoresObj jugador3= new JugadoresObj("Paco", "Lopez");

		jugadores.getItems().addAll(jugador1, jugador2, jugador3);
		jugadores.setValue(jugador1); //PARA QUE APARAEZCA UNO DESDE EL INICIO
			
		jugadores.setOnAction(e -> accionBoton());
		
		//CREAR BOTON
		
		Button elBoton = new Button("Dale");
		elBoton.setOnAction(e -> funcionJuegos());
	
		//CREAR COMBOBOX
		ComboBox jugadoresCombo= new ComboBox();
		jugadoresCombo.getItems().addAll(jugador1, jugador2, jugador3);
		
		//CREAR LIST
		ListView jugadoresList= new ListView();
		jugadoresList.getItems().addAll(jugador1, jugador2, jugador3);

		//PANEL
		BorderPane paneJugadores = new BorderPane(jugadoresCombo, jugadores, jugadoresList, elBoton, null);
		paneJugadores.setAlignment(jugadores, Pos.CENTER);
		paneJugadores.setAlignment(elBoton, Pos.CENTER);
		
		//CREACION DE LA ESCENA
		Scene miScene = new Scene(paneJugadores, 400, 200);
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Jugadores");
		primaryStage.show();
			
	}
	
	public void funcionJuegos() {
		//System.out.println(jugadores.getItems().size());
		
	}

	public void accionBoton() {
		
		String mensaje = "Has elegido a:\n";
		
		mensaje+= jugadores.getValue();
		
		VentanaEmergente.mostrar(mensaje, "Tu jugador favorito");
		
	}

	public static void main(String[] args) {
		launch(args);
		
			
	}
	
}

class JugadoresObj {
	
	String nombre;
	String apellido;
	
	public JugadoresObj(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
}
