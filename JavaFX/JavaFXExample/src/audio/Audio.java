package audio;

import java.io.File;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Audio extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		File miAudio = new File("C:\\Users\\Miguel\\Desktop\\Java\\Pildoras Informaticas\\JavaFX\\Imagenes ejemplo\\bachata.mp3");
		Media miMedia = new Media(miAudio.toURI().toString());
		MediaPlayer miPlayer = new MediaPlayer(miMedia);
		
		Button botPlay = new Button("Play");
		Button botPause = new Button("Pause");
		Button botStop = new Button("Stop");
		
		botPlay.setOnAction(e->{
			miPlayer.play();
		});
		botPause.setOnAction(e->{
			miPlayer.pause();
		});
		botStop.setOnAction(e->{
			miPlayer.stop();
		});
		
		HBox box = new HBox(20,botPlay,botPause,botStop);
		Scene miScene = new Scene(box); 
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Sonando audio");
		primaryStage.show();
		
		//DA ERROR EN ECLIPSE PERO FUNCIONA EN INTELLIJ
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
