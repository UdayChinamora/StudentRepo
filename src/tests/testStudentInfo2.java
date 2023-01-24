/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 24, 2023
*/
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.StudentInfo;
import model.Student;

/**
 * @author uchin
 *
 */
public class testStudentInfo2 {

	StudentInfo studentBL = new StudentInfo();
	Student Student = new Student("Sam");
	@Before
	public void setUp() throws Exception {
	}

	@Test
  	public void testStudentIsPermittedToDrive() {
  		Student.setAge(20);
  		assertTrue(studentBL. isPermittedToDrive(Student));
  		}
    
    @Test
  	public void testStudentIsNotPermittedToDrive() {
  		Student.setAge(15);
  		
  		assertFalse(studentBL. isPermittedToDrive(Student));
  		}

}
