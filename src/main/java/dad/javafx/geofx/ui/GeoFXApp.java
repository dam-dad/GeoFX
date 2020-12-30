package dad.javafx.geofx.ui;

import java.util.Locale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	
	private MainController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Locale.setDefault(Locale.ENGLISH);
		
		controller = new MainController();
		
		Scene escena = new Scene(controller.getView());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("GeoFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
