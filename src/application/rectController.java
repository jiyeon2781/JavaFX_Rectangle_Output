package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class rectController  implements Initializable {
	@FXML
	public Canvas canvas;
	public GraphicsContext gc;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		gc = canvas.getGraphicsContext2D(); 
		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED ,new EventHandler<MouseEvent>() { //마우스버튼을 눌렀을 때
		@Override
		public void handle(MouseEvent event) {
			gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); //clear
			draw(event.getX(),event.getY()); //사각형 출력
			}
		});
	
	}
	void draw(double x, double y) {
		gc.setFill(Color.SKYBLUE);
		gc.fillRect(x-25, y-25, 50, 50);
	}
}

