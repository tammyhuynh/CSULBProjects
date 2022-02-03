/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class PassFailActivity extends GradedActivity{
	
	//Initializing Field
	private double minPassingScore;
	
	//Overloaded Constructor
	PassFailActivity(double minPassingScore){

		this.minPassingScore = minPassingScore;
		super.setScore(minPassingScore);
	}
	
	//method that overrides superclass method -GradedActivity
	@Override 
	public char getGrade() {
		if (this.minPassingScore >=70) {
			return 'P';
		} else {
			return 'F';
		}
		
	}
}
