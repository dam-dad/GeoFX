package dad.javafx.geofx;

import dad.javafx.geofx.ui.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	
	private RootController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new RootController();
		
		Scene escena = new Scene(controller.getView());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("GeoFX");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
