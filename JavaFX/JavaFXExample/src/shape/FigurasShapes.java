package shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FigurasShapes extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group miGrupo = new Group();
		
		//FOR PARA CREAR LA CUADRICULA
		for(int i=0; i<600; i+=10) {
			Line linea1 = new Line(i, 0, i, 600);
			linea1.setStroke(Color.LIGHTGRAY);
			
			Line linea2 = new Line(0, i, 600, i);
			linea2.setStroke(Color.LIGHTGRAY);
			
			miGrupo.getChildren().addAll(linea1,linea2);
			
		}
		
		Rectangle rect1 = new Rectangle(50,25,100,140);
		rect1.setStroke(Color.BLACK);
		rect1.setFill(null); //rellena el rectangulo
		rect1.setStrokeWidth(3); //grosor del trazo
		miGrupo.getChildren().add(rect1);
		
		Rectangle rect2 = new Rectangle(250,25,100,140);
		rect2.setStroke(Color.BLUE);
		rect2.setFill(null); //rellena el rectangulo
		rect2.setStrokeWidth(3); //grosor del trazo
		rect2.setArcHeight(55);  //redondea las esquinas
		rect2.setArcWidth(55);
		miGrupo.getChildren().add(rect2);
		
		Rectangle rect3 = new Rectangle(450,25,100,140);
		rect3.setStroke(Color.GREEN);
		rect3.setFill(null); //rellena el rectangulo
		rect3.setStrokeWidth(3); //grosor del trazo
		rect3.setArcHeight(75);  //redondea las esquinas
		rect3.setArcWidth(125);
		miGrupo.getChildren().add(rect3);
		
		Circle circ = new Circle(100,300,75); //x , y , radio
		circ.setStroke(Color.RED);
		circ.setFill(null);
		circ.setStrokeWidth(3);
		miGrupo.getChildren().add(circ);
		
		Ellipse ellipse = new Ellipse(300,300,75,40); //x , y , radio x, radio y
		ellipse.setStroke(Color.YELLOW);
		ellipse.setFill(null);
		ellipse.setStrokeWidth(3);
		miGrupo.getChildren().add(ellipse);
		
		Ellipse ellipse2 = new Ellipse(500,300,40,75); //x , y , radio x, radio y
		ellipse2.setStroke(Color.ORANGE);
		ellipse2.setFill(null);
		ellipse2.setStrokeWidth(3);
		miGrupo.getChildren().add(ellipse2);
		
		Arc arc1 = new Arc(150,550,100,100,90,90); //centro x, centro y, radio x, radio y, start angle, length
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.PINK);
		arc1.setFill(null);
		arc1.setStrokeWidth(3);
		miGrupo.getChildren().add(arc1);
		
		Arc arc2 = new Arc(300,550,100,100,45,90); //centro x, centro y, radio x, radio y, start angle, length
		arc2.setType(ArcType.CHORD);
		arc2.setStroke(Color.RED);
		arc2.setFill(null);
		arc2.setStrokeWidth(3);
		miGrupo.getChildren().add(arc2);
		
		Arc arc3 = new Arc(500,550,100,100,45,90); //centro x, centro y, radio x, radio y, start angle, length
		arc3.setType(ArcType.ROUND);
		arc3.setStroke(Color.BROWN);
		arc3.setFill(null);
		arc3.setStrokeWidth(3);
		miGrupo.getChildren().add(arc3);
		
		Scene miScene = new Scene(miGrupo);
		
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Figuritas");
		
		primaryStage.show();
			
	}

	public static void main(String[] args) {
		launch(args);
	}
}
