package dad.javafx.geofx.client.ipapi;

@SuppressWarnings("serial")
public class IpApiException extends Exception {

	public IpApiException() {
		super();
	}

	public IpApiException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IpApiException(String message, Throwable cause) {
		super(message, cause);
	}

	public IpApiException(String message) {
		super(message);
	}

	public IpApiException(Throwable cause) {
		super(cause);
	}

}
