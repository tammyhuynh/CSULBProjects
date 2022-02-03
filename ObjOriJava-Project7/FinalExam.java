package project7;

public class FinalExam extends GradedActivity {
	//Initializing Fields
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	//Overloaded Constructor
	FinalExam(int numQuestions, int numMissed){
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;

		this.pointsEach = (this.numQuestions-this.numMissed)*100/this.numQuestions;
		super.setScore(pointsEach);
	}

	//Getters
	public int getNumMissed() {
		return numMissed;
	}
	public double getPointsEach() {
		return pointsEach;
	}
	
}
