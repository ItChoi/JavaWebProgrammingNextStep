package test.next.step.exception;

public class NegativeNumberException extends RuntimeException {
	
	public NegativeNumberException(String message) {
		System.out.println("-----------NegativeNumberException--------------");
		System.out.println("ErrorMessage: " + message);
		System.out.println("-----------NegativeNumberException--------------");
		
	}
}
