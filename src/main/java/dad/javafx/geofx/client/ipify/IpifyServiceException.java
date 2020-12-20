package dad.javafx.geofx.client.ipify;

@SuppressWarnings("serial")
public class IpifyServiceException extends Exception {

	public IpifyServiceException() {
		super();
	}

	public IpifyServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IpifyServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public IpifyServiceException(String message) {
		super(message);
	}

	public IpifyServiceException(Throwable cause) {
		super(cause);
	}

}
