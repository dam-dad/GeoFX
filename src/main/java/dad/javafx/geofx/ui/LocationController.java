package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.client.ipapi.Geo;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	// properties

	private ObjectProperty<Geo> geo = new SimpleObjectProperty<>();

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
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"), ResourceBundle.getBundle("i18n/messages"));
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
		
		geo.addListener((o, ov, nv) -> onGeoChanged(o, ov, nv));

	}

	private void onGeoChanged(ObservableValue<? extends Geo> o, Geo ov, Geo nv) {
		
		if (nv != null) {
			
			latitude.set(nv.getLatitude());
			longitude.set(nv.getLongitude());
			ipLocation.set(nv.getCountryName());
			countryCode.set(nv.getCountryCode());
			
		}
		
	}

	public GridPane getView() {
		return view;
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
