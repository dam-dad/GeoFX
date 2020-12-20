package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	// model

	private DoubleProperty latitude = new SimpleDoubleProperty();
	private DoubleProperty longitude = new SimpleDoubleProperty();
	private StringProperty ipLocation = new SimpleStringProperty();
	private StringProperty countryCode = new SimpleStringProperty();
	private ObjectProperty<Image> flag = new SimpleObjectProperty<>();

	// view

	@FXML
	private GridPane view;

	@FXML
	private Label latitudeLabel;

	@FXML
	private Label ipLocationLabel;

	@FXML
	private ImageView flagImage;

	@FXML
	private Label longitudeLabel;

	@FXML
	private Label cityLabel;

	@FXML
	private Label zipCodeLabel;

	@FXML
	private Label languageLabel;

	@FXML
	private Label timeZoneLabel;

	@FXML
	private Label callingCodeLabel;

	@FXML
	private Label currencyLabel;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		latitudeLabel.textProperty().bind(latitude.asString());
		longitudeLabel.textProperty().bind(longitude.asString());
		ipLocationLabel.textProperty().bind(ipLocation.concat(" (").concat(countryCode).concat(")"));
		flagImage.imageProperty().bind(flag);
		
		countryCode.addListener((o, ov, nv) -> {
			if (ov != null) {
				flag.set(null);
			}
			if (nv != null) {
				flag.set(new Image("/images/flags/" + nv.toUpperCase() + ".png"));
			}
		});

	}

	public GridPane getView() {
		return view;
	}

	public final DoubleProperty latitudeProperty() {
		return this.latitude;
	}

	public final double getLatitude() {
		return this.latitudeProperty().get();
	}

	public final void setLatitude(final double latitude) {
		this.latitudeProperty().set(latitude);
	}

	public final DoubleProperty longitudeProperty() {
		return this.longitude;
	}

	public final double getLongitude() {
		return this.longitudeProperty().get();
	}

	public final void setLongitude(final double longitude) {
		this.longitudeProperty().set(longitude);
	}

	public final StringProperty ipLocationProperty() {
		return this.ipLocation;
	}

	public final String getIpLocation() {
		return this.ipLocationProperty().get();
	}

	public final void setIpLocation(final String ipLocation) {
		this.ipLocationProperty().set(ipLocation);
	}

	public final StringProperty countryCodeProperty() {
		return this.countryCode;
	}

	public final String getCountryCode() {
		return this.countryCodeProperty().get();
	}

	public final void setCountryCode(final String countryCode) {
		this.countryCodeProperty().set(countryCode);
	}

}
