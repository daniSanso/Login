package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VentanaController implements Initializable{
	@FXML
	private MediaView mediaView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Media media = new Media("file:///C:/Users/21640249/video_arrecife.mp4");//ruta del video
		MediaPlayer player = new MediaPlayer(media);
		mediaView.setMediaPlayer(player);
		player.setVolume(0);//quitamos el sonido
		player.play();//para empezar video
	}

}
