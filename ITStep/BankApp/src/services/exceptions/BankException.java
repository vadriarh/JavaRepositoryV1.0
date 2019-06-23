package services.exceptions;

public class BankException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3453316370537941347L;
	private int status;

	public int getStatus() {
		return status;
	}

	public BankException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankException(String message, Throwable cause, int status) {
		super(message, cause);
		this.status = status;
		// TODO Auto-generated constructor stub
	}

	public BankException(String msg, int status) {
		super(msg);
		this.status = status;
	}

}
