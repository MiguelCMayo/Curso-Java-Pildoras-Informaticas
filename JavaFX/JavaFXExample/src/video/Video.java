package video;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Video extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		File f = new File("C:\\Users\\Miguel\\Desktop\\Java\\Pildoras Informaticas\\JavaFX\\Imagenes ejemplo\\perro_video.mp4");
		Media miMedia = new Media(f.toURI().toString());
		MediaPlayer miPlayer = new MediaPlayer(miMedia);
		miPlayer.setAutoPlay(true);
		MediaView miView = new MediaView(miPlayer);
		miView.setFitHeight(500);
		miView.setFitWidth(750);
		
		StackPane miStack = new StackPane(miView);
		Scene miScene = new Scene(miStack); 
		primaryStage.setScene(miScene);
		primaryStage.setTitle("Video");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
