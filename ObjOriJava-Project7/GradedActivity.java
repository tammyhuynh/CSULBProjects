/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class GradedActivity {
	
	//Initializing Field
	private double score;
	
	//getter and setter
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	//method to produce char for grade
	public char getGrade() {
		if (this.score<100 && this.score>=90) {
			return 'A';
		} else if (this.score<90 && this.score>=80) {
			return 'B';
		} else if (this.score<80 && this.score>=70) {
			return 'C';
		} else if (this.score<70 && this.score>=60) {
			return 'D';
		} else if (this.score<60 && this.score>=0) {
			return 'F';
		} else {
			System.out.println("Error: Score is out of range");
			return '\0';
		}
	}
	
}
