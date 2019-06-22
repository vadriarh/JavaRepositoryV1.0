package services.exceptions;

public class AccountOperationException extends BankException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4435211311036095450L;

	public AccountOperationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountOperationException(String message, Throwable cause, int status) {
		super(message, cause, status);

		// TODO Auto-generated constructor stub
	}

	public AccountOperationException(String msg, int status) {
		super(msg, status);

		// TODO Auto-generated constructor stub
	}

}
