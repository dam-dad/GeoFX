package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.client.ipapi.Geo;
import dad.javafx.geofx.client.ipapi.IpApi;
import dad.javafx.geofx.client.ipapi.IpApiException;
import dad.javafx.geofx.client.ipify.Ipify;
import dad.javafx.geofx.client.ipify.IpifyException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
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

public class MainController implements Initializable {

	// logic

	private Ipify ipify = new Ipify();
	private IpApi ipapi = new IpApi();

	// controllers

	private LocationController locationController = new LocationController();

	// model

	private StringProperty ip = new SimpleStringProperty();
	private ObjectProperty<Geo> geo = new SimpleObjectProperty<>();

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

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"), ResourceBundle.getBundle("i18n/messages"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		locationTab.setContent(locationController.getView());

		ipText.textProperty().bindBidirectional(ip);

		locationController.geoProperty().bind(geo);

		retrieveIp();

	}

	public void retrieveIp() {
		try {
			ip.set(ipify.getIp());
		} catch (IpifyException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void onCheckAction(ActionEvent event) {

		try {

			setGeo(ipapi.getGeoIpData(ip.get()));

		} catch (IpApiException e) {

			// TODO
			
		}

	}

	public BorderPane getView() {
		return view;
	}

	public final StringProperty ipProperty() {
		return this.ip;
	}

	public final String getIp() {
		return this.ipProperty().get();
	}

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}

	public final ObjectProperty<Geo> geoProperty() {
		return this.geo;
	}

	public final Geo getGeo() {
		return this.geoProperty().get();
	}

	public final void setGeo(final Geo geo) {
		this.geoProperty().set(geo);
	}

}
