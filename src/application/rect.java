package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class rect extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("rectfxml.fxml"));
		Scene scene = new Scene(root,700,700);
		stage.setScene(scene);
		stage.setTitle("사각형 출력");
		stage.show();
	
	}
	public static void main(String[] args){
		launch(args);
	}
}
