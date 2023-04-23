package scene;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrabajoTile extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//TILEPANE UBICA LOS RECTANGULOS UNO A CONTINUACION DEL OTRO
		TilePane miTile = new TilePane();
		
		//CREAR LOS RECTANGULOS UNO A UNO
		/*Rectangle rec1 = new Rectangle(100,100);
		rec1.setFill(Color.BLUE);
		Rectangle rec2 = new Rectangle(100,100);
		rec2.setFill(Color.RED);
		Rectangle rec3 = new Rectangle(100,100);
		rec3.setFill(Color.YELLOW);
		Rectangle rec4 = new Rectangle(100,100);
		rec4.setFill(Color.BLUE);
		Rectangle rec5 = new Rectangle(100,100);
		rec5.setFill(Color.RED);
		Rectangle rec6 = new Rectangle(100,100);
		rec6.setFill(Color.YELLOW);
		Rectangle rec7 = new Rectangle(100,100);
		rec7.setFill(Color.BLUE);
		Rectangle rec8 = new Rectangle(100,100);
		rec8.setFill(Color.RED);
		Rectangle rec9 = new Rectangle(100,100);
		rec9.setFill(Color.YELLOW);
		Rectangle rec10 = new Rectangle(100,100);
		rec10.setFill(Color.BLUE);
		Rectangle rec11 = new Rectangle(100,100);
		rec11.setFill(Color.RED);
		Rectangle rec12 = new Rectangle(100,100);
		rec12.setFill(Color.YELLOW);
		
		//PONER TEXTO DENTRO DE LOS CUADRADOS
		Text text1 = new Text("Cuadrado 1");
		StackPane stackRec1 = new StackPane(rec1, text1);
		Text text2 = new Text("Cuadrado 2");
		StackPane stackRec2 = new StackPane(rec2, text2);
		Text text3 = new Text("Cuadrado 3");
		StackPane stackRec3 = new StackPane(rec3, text3);
		Text text4 = new Text("Cuadrado 4");
		StackPane stackRec4 = new StackPane(rec4, text4);
		Text text5 = new Text("Cuadrado 5");
		StackPane stackRec5 = new StackPane(rec5, text5);
		Text text6 = new Text("Cuadrado 6");
		StackPane stackRec6 = new StackPane(rec6, text6);
		Text text7 = new Text("Cuadrado 7");
		StackPane stackRec7 = new StackPane(rec7, text7);
		Text text8 = new Text("Cuadrado 8");
		StackPane stackRec8 = new StackPane(rec8, text8);
		Text text9 = new Text("Cuadrado 9");
		StackPane stackRec9 = new StackPane(rec9, text9);
		Text text10 = new Text("Cuadrado 10");
		StackPane stackRec10 = new StackPane(rec10, text10);
		Text text11 = new Text("Cuadrado 11");
		StackPane stackRec11 = new StackPane(rec11, text11);
		Text text12 = new Text("Cuadrado 12");
		StackPane stackRec12 = new StackPane(rec12, text12);
		
		
		miTile = new TilePane(stackRec1,stackRec2,stackRec3,stackRec4,stackRec5,stackRec6,
										stackRec7,stackRec8,stackRec9,stackRec10,stackRec11,stackRec12);*/
		
		
		//CREAR LOS RECTANGULOS Y PONER TEXTO CON UN BUCLE FOR
		for (int i=1; i<13; i++) {
			Rectangle r = new Rectangle(100,100);
			r.setFill(Color.rgb(125, 240, 215));
			Label miLabel = new Label("Cuadrado " + i);
			StackPane miStack = new StackPane(r, miLabel);
			miTile.getChildren().add(miStack);
		}
		
		//BARRAS DE DESPLAZAMIENTO
		ScrollPane miScroll = new ScrollPane(miTile);
		miScroll.setMaxWidth(450);
		miScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS); //para que la barra se vea siempre 
		StackPane miStack = new StackPane(miScroll);
		
		//Poner separacion entre los rectangulos
		miTile.setHgap(10);
		miTile.setVgap(10);
		//Poner margenes
		miTile.setPadding(new Insets(10,10,10,10));
		
		Scene miScene = new Scene(miStack,600,400);
		
		primaryStage.setScene(miScene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
