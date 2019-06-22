package services.exceptions;

public class ClientOperationException extends BankException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6284655278867872272L;

	public ClientOperationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientOperationException(String msg, int status) {
		super(msg, status);
		// TODO Auto-generated constructor stub
	}

	public ClientOperationException(String message, Throwable cause, int status) {
		super(message, cause, status);
		// TODO Auto-generated constructor stub
	}

}
