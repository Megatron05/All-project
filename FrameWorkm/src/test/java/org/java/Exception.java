package org.java;

public class Exception {
	
	public static void main(String[] args) {
		try {
			
		System.out.println("message");
		throw new UserException("String");
			
		}
		catch(UserException e) {
			
			String message = e.getMessage();
			System.out.println(message);
		}	
	}

}
