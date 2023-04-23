package imagenes;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Recorrer_Imagenes extends Application {

	private final String RUTA = "C:\\Users\\Miguel\\Desktop\\Java\\Pildoras Informaticas\\JavaFX\\Imagenes ejemplo";
	
	@Override
	public void start(Stage primaryStage) {
		
		TilePane tile = new TilePane();
		tile.setHgap(20);
		tile.setVgap(20); //establecer separacion
		tile.setPadding(new Insets(10,10,10,10));
		tile.setPrefColumns(4); //cuantas columnas preferimos
		
		//GUARDAR LA RUTA EN UN ARCHIVO FILE
		File miDir = new File(RUTA);
		
		//CREAR UN ARRAY DE ARCHIVOS:
		File[] misArchivos = miDir.listFiles();
		
		for(File f: misArchivos) {
			Image miImg = new Image(f.toURI().toString(),200,200,true,true);
			ImageView miIview = new ImageView(miImg);
			Text titulo = new Text(f.getName()); //recuperar el titulo de la imagen
			titulo.setFont(new Font("Times New Roman",16));
			VBox panelVertical = new VBox(10,miIview,titulo);
			panelVertical.setAlignment(Pos.CENTER); //centrar el texto de las imagenes
			tile.getChildren().add(panelVertical);
		}
		
		ScrollPane miScroll = new ScrollPane(tile); //añadir barras de desplazamiento
		
		Scene miScene = new Scene(miScroll); 
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Imagenes en carpeta");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
