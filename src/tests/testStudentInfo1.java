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
public class testStudentInfo1 {

	StudentInfo studentBL = new StudentInfo();
	Student Student = new Student("Uday");
	@Before
	
	public void setUp() throws Exception {
	}

	@Test
	public void testcalculateGrade() {
		Student.setstudentScore(83);
		double grade = studentBL.calculateGrade(Student);
		assertEquals('B',grade,0.0);
	
	}
	
	@Test
	public void testcalculateGrade2() {
		Student.setstudentScore(43);
		double grade = studentBL.calculateGrade(Student);
		assertEquals('E',grade,0.0);
	
	}
    @Test
	public void testCalculatescorePercentage() {
		Student.setstudentScore(76);
		double score = studentBL.calculatescorePercentage(Student);
		assertEquals(76.00,score,0.0);
	
	}

}
