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
public class Student {
	 private String name;
	    private double studentScore;
	    private int age;
		
		public Student(String name) {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the studentScore
		 */
		public double getstudentScore() {
			return studentScore;
		}
		/**
		 * @param studentScore the studentScore to set
		 */
		public void setstudentScore(double studentScore) {
			this.studentScore = studentScore;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

}
