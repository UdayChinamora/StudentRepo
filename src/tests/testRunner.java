/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 24, 2023
*/
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



/**
 * @author uchin
 *
 */
public class testRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Result result = JUnitCore.runClasses(AllTests.class);
		
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			
			
		}
		System.out.println(result.wasSuccessful());
	}

	}


