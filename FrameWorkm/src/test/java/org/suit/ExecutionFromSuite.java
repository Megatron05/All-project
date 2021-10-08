package org.suit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.model.InitializationError;

@RunWith(Suite.class)
@SuiteClasses({LoginPage.class,PreOption.class,Select.class,Booking.class,ExecutionFromSuite.class})

public class ExecutionFromSuite {
	
@Test
	public static void main(String[] args) throws InitializationError {
		
		Result r = JUnitCore.runClasses(LoginPage.class,PreOption.class,Select.class,Booking.class);
		
		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		List<Failure> failures = r.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			Failure failure = failures.get(i);
			System.out.println(failure);
			
		}
		
		
		
		
		
		
	}
	
	

}
