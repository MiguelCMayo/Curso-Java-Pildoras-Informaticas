package treeView;

import emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CochesTreeView extends Application {

	TreeItem<String> root, renault, volvo, audi, seat;
	TreeView miArbol = new TreeView<String>();
	Label muestraNombres;
	
	@Override
	public void start(Stage primaryStage) {
		
		root = new TreeItem<String>("Coches");
		root.setExpanded(true);
		
		renault = new TreeItem<String>("Renault");
		root.getChildren().add(renault);
			renault.getChildren().add(new TreeItem<String>("Captur"));
			renault.getChildren().add(new TreeItem<String>("Clio"));
		
		volvo = new TreeItem<String>("Volvo");
		root.getChildren().add(volvo);
			volvo.getChildren().add(new TreeItem<String>("S40"));
			volvo.getChildren().add(new TreeItem<String>("S60"));
		
		
		audi = new TreeItem<String>("Audi");
		root.getChildren().add(audi);
			audi.getChildren().add(new TreeItem<String>("A5"));
			audi.getChildren().add(new TreeItem<String>("A3"));
		
		seat = new TreeItem<String>("Seat");
		root.getChildren().add(seat);
			seat.getChildren().add(new TreeItem<String>("Leon"));
			seat.getChildren().add(new TreeItem<String>("Ibiza"));
		
		miArbol = new TreeView<String>(root);
		
		//IMPLEMENTAR LA FUNCION PARA VER EL NOMBRE ABAJO
		miArbol.getSelectionModel().selectedItemProperty().addListener((valor, antiguoValor, nuevoValor)->
		seleccionItemArbol((TreeItem<String>) nuevoValor));
		
		
		
		//METODO LARGO PARA QUE SAGA EL TEXTO DEL NOMBRE ABAJO
		/*
		
		miArbol.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {

			@Override
			public void changed(ObservableValue valor, Object antiguoValor, Object nuevoValor) {
				
				String mensaje = "";
				ObservableList<TreeItem<String>> elementosSeleccionados = miArbol.getSelectionModel().getSelectedItems();
				
				for(TreeItem elemento: elementosSeleccionados) {
					mensaje+= elemento.getValue() + "\n";
					muestraNombres.setText(mensaje);
					VentanaEmergente.mostrar("El coche seleccionado es:\n" + mensaje, "Coche selecionado");
				}
			}
			
			
		});*/
		
		
		//LABEL
		muestraNombres = new Label();

		//PANEL
		
		VBox miPane = new VBox();
		miPane.setPadding(new Insets(20,20,20,20));
		miPane.getChildren().addAll(miArbol, muestraNombres);
		Scene scene = new Scene(miPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mis coches");
		primaryStage.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void seleccionItemArbol (TreeItem<String> item) {
		if(item != null) {
			muestraNombres.setText(item.getValue());
			VentanaEmergente.mostrar("El coche seleccionado es:\n" + item.getValue(), "Coche selecionado");
		}
	}

}
