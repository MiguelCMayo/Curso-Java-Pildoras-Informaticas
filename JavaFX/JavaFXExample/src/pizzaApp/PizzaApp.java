package pizzaApp;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PizzaApp extends Application {
	
	TextField txtNombre, txtNTelefono, txtDireccion;
	Stage miStage;
	RadioButton rPequeña;
    RadioButton rMediana;
    RadioButton rGrande;
	RadioButton rFina;
    RadioButton rNormal;
    CheckBox peperoni;
    CheckBox queso;
    CheckBox pimiento;
    CheckBox aceitunas;
    CheckBox champiñones;
    CheckBox tomate;
    CheckBox anchoas;

	@Override
	public void start(Stage primaryStage) {
		
				miStage = primaryStage;
		
				//TEXTO DE CABECERA
				Text txtCabecera = new Text ("Pide tu pizza");
				
				//ETIQUETA DEL NOMBRE
				Label lbNombre = new Label("Nombre");
				lbNombre.setMinWidth(100);
				lbNombre.setAlignment(Pos.BOTTOM_LEFT);
				//CAMPO DE TEXTO NOMBRE
				txtNombre = new TextField();
				txtNombre.setMinWidth(200);
				txtNombre.setMaxWidth(200);
				txtNombre.setPromptText("Introduce tu nombre");
				// PANEL NOMBRE
				HBox paneNombre = new HBox(20, lbNombre,txtNombre);
				paneNombre.setPadding(new Insets(10));
				
				//ETIQUETA DEL TELEFONO
				Label lbNTelefono = new Label("N de Telefono");
				lbNTelefono.setMinWidth(100);
				lbNTelefono.setAlignment(Pos.BOTTOM_LEFT);
				//CAMPO DE TEXTO DEL TELEFONO
				txtNTelefono = new TextField();
				txtNTelefono.setMinWidth(200);
				txtNTelefono.setMaxWidth(200);
				txtNTelefono.setPromptText("Introduce el numero de Telefono");
				// PANEL DEL TELEFONO
				HBox paneTelefono = new HBox(20, lbNTelefono,txtNTelefono);
				paneTelefono.setPadding(new Insets(10));
				
				//ETIQUETA DE LA DIRECCION
				Label lbDireccion = new Label("Direccion");
				lbDireccion.setMinWidth(100);
				lbDireccion.setAlignment(Pos.BOTTOM_LEFT);
				//CAMPO DE TEXTO DE LA DIRECCION
				txtDireccion = new TextField();
				txtDireccion.setMinWidth(200);
				txtDireccion.setMaxWidth(200);
				txtDireccion.setPromptText("Introduce la direccion");
				//PANEL DE LA DIRECCION
				HBox paneDireccion = new HBox(20, lbDireccion,txtDireccion);
				paneDireccion.setPadding(new Insets(10));
				
				//RADIOBUTTON TAMAÑO PIZZA	
				Label lbTamano = new Label("Tamaño:");
				
				ToggleGroup tgTamano = new ToggleGroup();
		        
				rPequeña = new RadioButton("Pequeña");
		        rMediana = new RadioButton("Mediana");
		        rGrande = new RadioButton("Grande");
		        
		        rMediana.setSelected(true); //QUEDA MARCADO DE INICIO
		        
		        rPequeña.setToggleGroup(tgTamano);
		        rMediana.setToggleGroup(tgTamano);
		        rGrande.setToggleGroup(tgTamano);
		        
		        VBox paneTamano = new VBox(10, lbTamano, rPequeña, rMediana, rGrande);
		        paneTamano.setPadding(new Insets(10));
		        
		        //RADIOBUTTON MASA PIZZA
				Label lbMasa = new Label("Masa:");
				
				ToggleGroup tgMasa = new ToggleGroup();
				  
		        rFina = new RadioButton("Fina");
		        rNormal = new RadioButton("Normal");
		        
		        rFina.setSelected(true);
		        
		        rFina.setToggleGroup(tgMasa);
		        rNormal.setToggleGroup(tgMasa);
		  
		        VBox paneMasa = new VBox(10, lbMasa, rFina, rNormal);
		        paneMasa.setPadding(new Insets(10));
		        
		        //CHECKBOX INGREDIENTES
		        Label lbIngredientes = new Label("Ingredientes:");
		        
		        peperoni = new CheckBox("peperoni");
		        queso = new CheckBox("queso");
		        pimiento = new CheckBox("Pimiento");
		        aceitunas = new CheckBox("aceitunas");
		        champiñones = new CheckBox("champiñones");
		        tomate = new CheckBox("tomate");
		        anchoas = new CheckBox("anchoas");
		        
		        FlowPane paneIngredientes = new FlowPane(Orientation.VERTICAL, peperoni, queso, pimiento, aceitunas, champiñones, tomate, anchoas);
		        
		        paneIngredientes.setPadding(new Insets(10,0,10,0));
		        paneIngredientes.setHgap(20);
		        paneIngredientes.setVgap(10);
		        paneIngredientes.setPrefWrapLength(100);
		        
		        VBox paneIngredientesVertical = new VBox(lbIngredientes, paneIngredientes);
		        
				//BOTON OK
				Button botonOk = new Button("OK");
				botonOk.setMinWidth(80);
				botonOk.setMaxWidth(80);
				botonOk.setOnAction(e -> botonOkClick());
				
				//BOTON CANCELAR
				Button botonCancelar = new Button("Cancelar");
				botonCancelar.setMinWidth(80);
				botonCancelar.setMaxWidth(80);
				botonCancelar.setOnAction(e -> botonCancelarClick());
				
				HBox paneBotones = new HBox(20, botonOk, botonCancelar);
				paneBotones.setPadding(new Insets(10));
				paneBotones.setAlignment(Pos.BOTTOM_RIGHT);
				
				// CREACION DE PANELES GENERALES
				HBox panelHorizontal = new HBox(10, paneTamano, paneMasa, paneIngredientesVertical);
				HBox panelHorizontalBotones = new HBox(10, paneBotones);
				VBox panelPrincipal = new VBox(10, txtCabecera, paneNombre, paneTelefono, paneDireccion, panelHorizontal, panelHorizontalBotones);
				panelPrincipal.setPadding(new Insets(10,10,10,10));
			
				//CREACION DE LA ESCENA
				Scene miScene = new Scene(panelPrincipal);
				primaryStage.setScene(miScene);
				primaryStage.setTitle("Pedido pizza");
				primaryStage.show();
		
	}
	
		private void botonCancelarClick() {
		miStage.close();
	}

		private void botonOkClick() {
		
		String mensaje = "";
		
		if(txtNombre.getText().length()==0) mensaje+= "\nTu nombre es requerido";
		if(txtNTelefono.getText().length()==0) mensaje+= "\nTu telefono es requerido";
		if(txtDireccion.getText().length()==0) mensaje+= "\nTu direccion es requerida";
		if(mensaje.length()==0) {
			
				mensaje = "Cliente:\n\n" + "\t" + 
						txtNombre.getText() + "\n\t" + 
						txtNTelefono.getText() + "\n\t" + 
						txtDireccion.getText() + "\n\n" +
						"Has pedido el tamaño ";
				
		if(rPequeña.isSelected())	mensaje+="pequeño";
		if(rMediana.isSelected())	mensaje+="mediano";
		if(rGrande.isSelected())	mensaje+="grande";
		
		mensaje+= ", con masa ";
		if(rFina.isSelected())	mensaje+="fina ";
		if(rNormal.isSelected())	mensaje+="normal ";
		
		mensaje+= "y los siguentes ingredientes:\n";
		if(peperoni.isSelected())	mensaje+="- Peperoni\n";
		if(queso.isSelected())	mensaje+="- Queso\n";
		if(pimiento.isSelected())	mensaje+="- Pimiento\n";
		if(aceitunas.isSelected())	mensaje+="- Aceitunas\n";
		if(champiñones.isSelected())	mensaje+="- Champiñones\n";
		if(tomate.isSelected())	mensaje+="- Tomate\n";
		if(anchoas.isSelected())	mensaje+="- Anchoas\n";
		
				VentanaEmergente.mostrar(mensaje,  "Pedido realizado:");		
		}else {
			VentanaEmergente.mostrar(mensaje, "Faltan datos!!");
		}
		
		
	}
		
	

	public static void main(String[] args) {
		launch(args);
	}
}
