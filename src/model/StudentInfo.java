/**
 *@author Uday F Chinhamora- ufchinhamora
 *CIS175 -Spring 2023
 *Jan 24, 2023
*/
package model;

/**
 * @author uchin
 *
 */
public class StudentInfo {
	public double calculatescorePercentage(Student Student) {
		double scorePercentage = 0;
		scorePercentage = Student.getstudentScore();
		return scorePercentage;
	}
	
	public char calculateGrade(Student Student) {
		char grade = 'F';
		if (Student.getstudentScore() >= 90) {
			grade = 'A';
		}
		else if(Student.getstudentScore() >= 80){
			grade = 'B';
		}
		else if(Student.getstudentScore() >= 70){
			grade = 'C';
		}
		else if(Student.getstudentScore() >= 50){
			grade = 'D';
		}
		else {
			grade = 'E';
		}
		return grade;
	}
	
	
	public boolean isPermittedToDrive(Student Student) {
		boolean  isPermitted = false;
		if (Student.getAge() > 18) {
			isPermitted= true;
		}
		else {
			isPermitted = false;
		}
		return isPermitted;
	}

}
