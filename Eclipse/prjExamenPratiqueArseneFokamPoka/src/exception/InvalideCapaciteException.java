package exception;

public class InvalideCapaciteException extends Exception {

	@Override
	public String toString() {
		return "Capacite invalide. Elle doit etre prise entre 125 et 225";
	}

	public InvalideCapaciteException() {
		// TODO Auto-generated constructor stub
	}

	public InvalideCapaciteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalideCapaciteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public InvalideCapaciteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalideCapaciteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
