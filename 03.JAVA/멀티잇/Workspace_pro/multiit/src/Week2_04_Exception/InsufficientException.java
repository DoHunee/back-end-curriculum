package Week2_04_Exception;


public class InsufficientException extends Exception
{
	public InsufficientException() {}
	
	public InsufficientException(String message) {
		super(message);
	}

}
