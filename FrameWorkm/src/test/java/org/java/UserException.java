package org.java;

public class UserException extends Throwable {
	public String message;
	public UserException(String message) {
		this.message=message;
		
		
		
	}
	@Override
	public String getMessage() {
		return ("exception message is"+ message);	
	}
	
	
	

}
