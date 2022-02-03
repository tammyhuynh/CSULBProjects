/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class PassFailExam  extends PassFailActivity{
	
	//Initializing Fields
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	//Overloaded Constructor
	PassFailExam(int numQuestions,int numMissed){
		super((numQuestions-numMissed)*100/numQuestions);
		this.numQuestions= numQuestions;
		this.numMissed = numMissed;
	}

	//Getters
	public double getPointsEach() {
		this.pointsEach= (this.numQuestions-this.numMissed)*100/this.numQuestions;
	
		return pointsEach;
	}
	public int getNumMissed() {
		return numMissed;
	}
}
