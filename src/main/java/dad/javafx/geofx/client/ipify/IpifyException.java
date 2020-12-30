package dad.javafx.geofx.client.ipify;

@SuppressWarnings("serial")
public class IpifyException extends Exception {

	public IpifyException() {
		super();
	}

	public IpifyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IpifyException(String message, Throwable cause) {
		super(message, cause);
	}

	public IpifyException(String message) {
		super(message);
	}

	public IpifyException(Throwable cause) {
		super(cause);
	}

}
