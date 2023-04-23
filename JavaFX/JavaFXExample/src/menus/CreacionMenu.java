package menus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CreacionMenu extends Application {
	
	MenuItem itemNuevo, itemGuardarComo, itemCortar, itemGuardar, itemCopiar, itemPegar;
	CheckMenuItem itemOpcion1, itemOpcion2, itemOpcion3;
	RadioMenuItem itemRadio1, itemRadio2, itemRadio3;
	
	@Override
	public void start(Stage primaryStage) {
		
		//CREACION DEL MENU
		MenuBar menuBar = new MenuBar();
		
		Menu menuArchivo = new Menu("Archivo");
		menuBar.getMenus().add(menuArchivo);
		itemNuevo = new MenuItem("Nuevo");
		itemGuardarComo = new MenuItem("Guardar como");
		itemGuardar = new MenuItem("Guardar");
		menuArchivo.getItems().addAll(itemNuevo,itemGuardarComo, itemGuardar);
		
		Menu menuEdicion = new Menu("Edición");
		menuBar.getMenus().add(menuEdicion);
		itemCortar = new MenuItem("Cortar");
		itemCopiar = new MenuItem("Copiar");
		itemPegar = new MenuItem("Pegar");
		itemPegar.setDisable(true);
		menuEdicion.getItems().addAll(itemCortar, itemCopiar, itemPegar);
		
		Menu menuCheckMenuItem = new Menu("Checks");
		menuBar.getMenus().add(menuCheckMenuItem);
		itemOpcion1 = new CheckMenuItem("Check 1");
		itemOpcion2 = new CheckMenuItem("Check 2");
		itemOpcion3 = new CheckMenuItem("Check 3");
		menuCheckMenuItem.getItems().addAll(itemOpcion1, itemOpcion2, itemOpcion3);
		
		Menu menuRadioMenuItem = new Menu("Radios");
		menuBar.getMenus().add(menuRadioMenuItem);
		itemRadio1 = new RadioMenuItem("Radio 1");
		itemRadio2 = new RadioMenuItem("Radio 2");
		itemRadio3 = new RadioMenuItem("Radio 3");
		ToggleGroup radios = new ToggleGroup();
		itemRadio1.setToggleGroup(radios);
		itemRadio2.setToggleGroup(radios);
		itemRadio3.setToggleGroup(radios);
		menuRadioMenuItem.getItems().addAll(itemRadio1, itemRadio2, itemRadio3);
		
		//CREACION MENU PARA SUBMENU
		Menu menuOpciones = new Menu("Opciones");
		menuBar.getMenus().add(menuOpciones);
		Menu menuMasOpciones = new Menu("Mas opciones");
		menuOpciones.getItems().addAll(menuMasOpciones);
		
		//CREACION SUBMENU
		MenuItem itemSubMenu1 = new MenuItem("SubMenu 1");
		MenuItem itemSubMenu2 = new MenuItem("SubMenu 2");
		MenuItem itemSubMenu3 = new MenuItem("SubMenu 3");
		menuMasOpciones.getItems().addAll(itemSubMenu1, itemSubMenu2, itemSubMenu3);
		
		//CREACION MENU PERSONALIZADO
		TextField cuadroNombre = new TextField();
		cuadroNombre.setPromptText("Nombre de usuario");
		CustomMenuItem menuItemNombre = new CustomMenuItem(cuadroNombre);
		menuItemNombre.setHideOnClick(false);
		menuMasOpciones.getItems().add(menuItemNombre);
		
		//FUNCIONES DE LOS ITEM UNO A UNO
		/*itemNuevo.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		        System.out.println("Has dado en Nuevo");
		    }
		});*/
		
		//UNA FUNCION PARA TODOS LOS ITEM
		itemNuevo.setOnAction(e->accionMenus(e));
		itemGuardar.setOnAction(e->accionMenus(e));
		itemGuardarComo.setOnAction(e->accionMenus(e));
		itemCortar.setOnAction(e->accionMenus(e));
		itemCopiar.setOnAction(e->accionMenus(e));
		itemPegar.setOnAction(e->accionMenus(e));
		itemOpcion1.setOnAction(e->accionMenus(e));
		itemOpcion2.setOnAction(e->accionMenus(e));
		itemOpcion3.setOnAction(e->accionMenus(e));
		itemRadio1.setOnAction(e->accionMenus(e));
		itemRadio2.setOnAction(e->accionMenus(e));
		itemRadio3.setOnAction(e->accionMenus(e));
		
		//CREACION DEL PANE
		BorderPane miPane = new BorderPane(null, menuBar,null,null,null);
		
		//CREACION DE LA ESCENA
		Scene miScene = new Scene(miPane, 600, 400);
		primaryStage.setScene(miScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void accionMenus (ActionEvent e) {
		
		/*if(e.getSource() == itemNuevo) System.out.println("Has pulsado el boton de Nuevo");
		if(e.getSource() == itemGuardar) System.out.println("Has pulsado el boton de Guardar");
		if(e.getSource() == itemCortar) System.out.println("Has pulsado el boton de Cortar");
		if(e.getSource() == itemCopiar) System.out.println("Has pulsado el boton de Copiar");*/
		
		MenuItem item = (MenuItem) e.getSource();
		System.out.println("Has pulsado el boton de: " + item.getText());
		
		//Cambiar el texto una vez lo has pulsado
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
		
		//Desabilitar un boton al pulsar otro
		if(item.getText().equals("Guardar como")) itemGuardar.setDisable(true);
		
		//Habilitar un boton al pulsar otro
		if(item.getText().equals("Cortar")) itemPegar.setDisable(false);
		if(item.getText().equals("Copiar")) itemPegar.setDisable(false);
		
		//Mostrar si estan activadas o desactivadas las opciones
		/*if(((CheckMenuItem) item).isSelected() == true) System.out.println(item.getText() + " activada");
		else System.out.println(item.getText() + " desactivada");*/
		
		if(e.getSource().getClass().getSimpleName().equals("RadioMenuItem")) System.out.println(item.getText() + " activada");
		else if (e.getSource().getClass().getSimpleName().equals("CheckMenuItem")) System.out.println(item.getText() + " activada");
	}
}
