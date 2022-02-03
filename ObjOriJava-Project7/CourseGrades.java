/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class CourseGrades implements Analyzable{
	
	//Initializing Fields
	private GradedActivity grades[];
	private int NUM_GRADES = 4;
	
	//Default Constructor
	CourseGrades(){
		grades = new GradedActivity [NUM_GRADES];
	}
	
	//Set GradedActivity type into Array
	public void setLab(GradedActivity aLab) {
		this.grades[0] = aLab;
	}
	public void setPassFailExam(PassFailExam aPassFailExam) {
		this.grades[1] = aPassFailExam;
	}
	public void setEssay(Essay anEssay) {
		this.grades[2]= anEssay;
	}
	public void setFinalExam(FinalExam aFinalExam) {
		this.grades[3] = aFinalExam;
	}
	
	//to String method
	@Override
	public String toString() {
		return "Lab Score: " +grades[0].getScore() +"  Grade: "+ grades[0].getGrade()
				+"\nPass/Fail Exam Score:  " +grades[1].getScore()+"  Grade: "+ grades[1].getGrade()
				+"\nEssay Score: " +grades[2].getScore()+"  Grade: " + grades[2].getGrade()
				+"\nFinal Exam Score: " +grades[3].getScore()+"  Grade: " + grades[3].getGrade()
				+"\nAverage Score: "+ getAverage()
				+"\nHighest Score: "+getHighest().getScore()
				+"\nLowest Score: " + getLowest().getScore();
				
	}
	
	//Overridden methods from the interface Analyzable
	@Override
	public double getAverage() {
		double ave=0;
		for (int i =0; this.grades.length>i;i++) {
			ave= ave+grades[i].getScore();
		}
		ave = ave/this.grades.length;
		return ave;
	}
	@Override
	public GradedActivity getHighest() {
		int temp = 0;
		for(int i = 0;this.grades.length-1>i;i++) {
			if (this.grades[temp].getScore()<this.grades[i+1].getScore()) {
				temp =i+1;
			}
		}
		return grades[temp];
	}
	@Override
	public GradedActivity getLowest() {
		int temp = 0;
		for(int i = 0;this.grades.length-1>i;i++) {
			if (this.grades[temp].getScore()>this.grades[i+1].getScore()) {
				temp =i+1;
			}
		}
		return grades[temp];
	}

	

	
	
}
