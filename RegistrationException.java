package javasample5;

public class RegistrationException extends Exception {
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
		ENTERED_NULL, EmptyType;
	}

	ExceptionType type;

	public RegistrationException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}

}
