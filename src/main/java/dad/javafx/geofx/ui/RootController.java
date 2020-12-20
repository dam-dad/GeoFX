package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.client.ipapi.IpApiService;
import dad.javafx.geofx.client.ipify.IpifyService;
import dad.javafx.geofx.client.ipify.IpifyServiceException;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable {
	
	// logic
	
	private IpifyService ipify = new IpifyService();
	private IpApiService ipapi = new IpApiService();

	// controllers

	private LocationController locationController = new LocationController();
	
	// model
	
	private StringProperty ip = new SimpleStringProperty();
	
	// view

	@FXML
	private BorderPane view;

	@FXML
	private TextField ipText;

	@FXML
	private Button checkButton;

	@FXML
	private Tab locationTab;

	@FXML
	private Tab connectionTab;

	@FXML
	private Tab secutiryTab;

	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		locationTab.setContent(locationController.getView());
		
		ipText.textProperty().bindBidirectional(ip);
		
		try {
			ip.set(ipify.getIp());
		} catch (IpifyServiceException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void onCheckAction(ActionEvent event) {

		locationController.setLongitude(1);
		locationController.setLatitude(2);
		locationController.setIpLocation("Spain");
		locationController.setCountryCode("es");
		
	}

	public BorderPane getView() {
		return view;
	}

}
