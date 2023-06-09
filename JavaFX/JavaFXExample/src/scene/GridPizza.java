package scene;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GridPizza extends Application {
	
	TextField txtNombre, txtNTelefono, txtDireccion;
	Stage miStage;
	RadioButton rPeque�a;
    RadioButton rMediana;
    RadioButton rGrande;
	RadioButton rFina;
    RadioButton rNormal;
    
    ObservableList<String> viewIngredientes;
    ListView<String> listView;
    StringBuilder mensajeIngredientes;

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
				
				//ETIQUETA DEL TELEFONO
				Label lbNTelefono = new Label("N de Telefono");
				lbNTelefono.setMinWidth(100);
				lbNTelefono.setAlignment(Pos.BOTTOM_LEFT);
				//CAMPO DE TEXTO DEL TELEFONO
				txtNTelefono = new TextField();
				txtNTelefono.setMinWidth(200);
				txtNTelefono.setMaxWidth(200);
				txtNTelefono.setPromptText("Introduce el numero de Telefono");
				
				//ETIQUETA DE LA DIRECCION
				Label lbDireccion = new Label("Direccion");
				lbDireccion.setMinWidth(100);
				lbDireccion.setAlignment(Pos.BOTTOM_LEFT);
				//CAMPO DE TEXTO DE LA DIRECCION
				txtDireccion = new TextField();
				txtDireccion.setMinWidth(200);
				txtDireccion.setMaxWidth(200);
				txtDireccion.setPromptText("Introduce la direccion");
				
				//RADIOBUTTON TAMA�O PIZZA	
				Label lbTamano = new Label("Tama�o:");
				
				ToggleGroup tgTamano = new ToggleGroup();
		        
				rPeque�a = new RadioButton("Peque�a");
		        rMediana = new RadioButton("Mediana");
		        rGrande = new RadioButton("Grande");
		        
		        rMediana.setSelected(true); //QUEDA MARCADO DE INICIO
		        
		        rPeque�a.setToggleGroup(tgTamano);
		        rMediana.setToggleGroup(tgTamano);
		        rGrande.setToggleGroup(tgTamano);
		        
		        VBox paneTamano = new VBox(10, lbTamano, rPeque�a, rMediana, rGrande);
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
		        
		        //LISTVIEW INGREDIENTES
		        
		        viewIngredientes = FXCollections.observableArrayList("peperoni", "queso", "Pimiento", "aceitunas", "champi�ones", "tomate", "anchoas");
		        listView = new ListView<String>(viewIngredientes);
		    
		        listView.setPrefWidth(120);
		        listView.setPrefHeight(100);
		        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		        
		        listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends String> ov, String old_val, String new_val) -> {
		        	ObservableList<String> selectedItems = listView.getSelectionModel().getSelectedItems();

		        	StringBuilder builder = new StringBuilder();

		        	for (String name : selectedItems) {
		        	mensajeIngredientes = builder.append(name + "\n");
		        	}

		        	});

		        FlowPane paneIngredientes = new FlowPane(Orientation.VERTICAL, listView);
		        
		        paneIngredientes.setPadding(new Insets(10,0,10,0));
		        paneIngredientes.setHgap(20);
		        paneIngredientes.setVgap(10);
		        paneIngredientes.setPrefWrapLength(100);

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

				//CREACION DEL GRID
				GridPane miGrid = new GridPane();
				miGrid.setPadding(new Insets(10));
				miGrid.setHgap(10);
				miGrid.setVgap(10);
				miGrid.setMinWidth(400);
				miGrid.setPrefWidth(200);
				miGrid.setMaxWidth(200);
				miGrid.setMaxHeight(200);
				
				//Agregar nodos al grid
				miGrid.addRow(0, txtCabecera);
				miGrid.setColumnSpan(txtCabecera, 3);
				miGrid.setHalignment(txtCabecera, HPos.CENTER);
				miGrid.addRow(1, lbNombre,txtNombre);
				miGrid.setColumnSpan(txtNombre, 2); //el 2 es para que ocupe dos columnas
				miGrid.addRow(2, lbNTelefono,txtNTelefono);
				miGrid.setColumnSpan(txtNTelefono, 2);
				miGrid.addRow(3, lbDireccion,txtDireccion);
				miGrid.setColumnSpan(txtDireccion, 2);
				miGrid.addRow(4, paneTamano, paneMasa, paneIngredientes);
				miGrid.addRow(5, botonOk,botonCancelar);

				//CREACION DE LA ESCENA
				Scene miScene = new Scene(miGrid);
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
						"Has pedido el tama�o ";
				
		if(rPeque�a.isSelected())	mensaje+="peque�o";
		if(rMediana.isSelected())	mensaje+="mediano";
		if(rGrande.isSelected())	mensaje+="grande";
		
		mensaje+= ", con masa ";
		if(rFina.isSelected())	mensaje+="fina ";
		if(rNormal.isSelected())	mensaje+="normal ";
		
		mensaje+= "y los siguentes ingredientes:\n";
		mensaje+=mensajeIngredientes;

				VentanaEmergente.mostrar(mensaje,  "Pedido realizado:");		
		}else {
			VentanaEmergente.mostrar(mensaje, "Faltan datos!!");
		}
		
		
	}
		
	

	public static void main(String[] args) {
		launch(args);
	}
}