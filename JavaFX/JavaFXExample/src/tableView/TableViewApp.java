package tableView;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class TableViewApp extends Application {
	
	TextField txtTitulo,txtAño, txtPrecio;
	TableView<Pelicula> tableView;

	@Override
	public void start(Stage primaryStage) {
		
		//CREAR TABLEVIEW
		tableView = new TableView();
		TableColumn<Pelicula, String> colTitulo = new TableColumn<>("Titulo");
		TableColumn<Pelicula, Integer> colAño = new TableColumn<>("Año");
		TableColumn<Pelicula, Double> colPrecio = new TableColumn<>("Precio");
		tableView.getColumns().addAll(colTitulo, colAño, colPrecio);
		tableView.setEditable(true);
		
		
		//CONECTAR LAS COLUMNAS CON LOS ATRIBUTOS DE LA CLASE
		colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		colAño.setCellValueFactory(new PropertyValueFactory<>("año"));
		colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
		
		//DARLE UN ANCHO A LAS COLUMNAS
		colTitulo.setMinWidth(200);
		colAño.setMinWidth(200);
		colPrecio.setMinWidth(200);
		
		//EDITAR LAS CELDAS
		colTitulo.setCellFactory(TextFieldTableCell.forTableColumn());
		colAño.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		colPrecio.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		
		//GUARDAR LAS MODIFICACIONES DE CELDA
		colTitulo.setOnEditCommit(e->modificaTitulo(e));
		colAño.setOnEditCommit(e->modificaAño(e));
		colPrecio.setOnEditCommit(e->modificaPrecio(e));
		
		//INTRODUCIR DATOS EN LA TABLA
		Pelicula p1 = new Pelicula("El padrino", 1972, 19.99);
		Pelicula p2 = new Pelicula("El mago de Oz", 1939, 19.99);
		Pelicula p3 = new Pelicula("Pulp Fiction", 1994, 19.99);

		tableView.getItems().addAll(p1, p2, p3);
		
		//CREAR PANEL INFERIOR PARA INTRODUCIR DATOS
		txtTitulo = new TextField();
		txtTitulo.setPromptText("Titulo");
		txtAño = new TextField();
		txtAño.setPromptText("Año");
		txtPrecio = new TextField();
		txtPrecio.setPromptText("Precio");
		
		txtTitulo.setMinWidth(150);
		txtAño.setMinWidth(150);
		txtPrecio.setMinWidth(150);

		//CREACION DEL BOTON
		Button botonAdd = new Button("Añadir");
		botonAdd.setMinWidth(80);
		botonAdd.setMaxWidth(80);
		botonAdd.setOnAction(e -> agregarPeliculas());
		
		Button botonEliminar = new Button("Eliminar");
		botonEliminar.setMinWidth(80);
		botonEliminar.setMaxWidth(80);
		botonEliminar.setOnAction(e -> eliminarPeliculas());
		
		HBox datos = new HBox(txtTitulo,txtAño,txtPrecio);
		HBox botones = new HBox(botonAdd,botonEliminar);
		datos.setSpacing(7);
		botones.setSpacing(7);
		
		//PANEL
		VBox miPane = new VBox();
		miPane.setPadding(new Insets(20,20,20,20));
		miPane.getChildren().addAll(tableView,datos,botones);
		Scene scene = new Scene(miPane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Mis peliculas");
		primaryStage.show();
		
	}

	private void modificaTitulo(CellEditEvent<Pelicula, String> e) {
		
		Pelicula p = e.getRowValue();
		p.setTitulo(e.getNewValue());
	}
	
	private void modificaAño(CellEditEvent<Pelicula, Integer> e) {
		
		Pelicula p = e.getRowValue();
		p.setAño(e.getNewValue());
	}
	
	private void modificaPrecio(CellEditEvent<Pelicula, Double> e) {
		
		Pelicula p = e.getRowValue();
		p.setPrecio(e.getNewValue());
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void agregarPeliculas() {
		
		Pelicula peliNueva = new Pelicula();
		peliNueva.setTitulo(txtTitulo.getText());
		peliNueva.setAño(Integer.parseInt(txtAño.getText()));
		peliNueva.setPrecio(Double.parseDouble(txtPrecio.getText()));
		
		tableView.getItems().add(peliNueva);
		
		txtTitulo.clear();
		txtAño.clear();
		txtPrecio.clear();
	}
	
	public void eliminarPeliculas() {
		
		ObservableList<Pelicula> seleccionados = tableView.getSelectionModel().getSelectedItems();
		ObservableList<Pelicula> peliculas = tableView.getItems();
		
		for (Pelicula p: seleccionados) {
			peliculas.remove(p);
		}
	}
	
	public class Pelicula {
	    private String titulo;
	    private int Año;
	    private Double precio;
	    
	    public Pelicula() {
	    }

	    public Pelicula(String titulo, int Año, Double precio) {
	        this.titulo = titulo;
	        this.Año = Año;
	        this.precio = precio;
	    }

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAño() {
			return Año;
		}

		public void setAño(int Año) {
			this.Año = Año;
		}

		public Double getPrecio() {
			return precio;
		}

		public void setPrecio(Double precio) {
			this.precio = precio;
		}

	    
	}
}



