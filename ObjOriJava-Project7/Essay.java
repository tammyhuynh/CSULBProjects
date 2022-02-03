/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class Essay extends GradedActivity{
	
	//Initializing Fields
	private double grammer;
	private double spelling;
	private double correctLength;
	private double content;
	
	//Set Score method
	public void setScore(double grammer, double spelling, double correctLength,double content) {
		boolean valid = false;
		
		//Check whether inputs are valid scores
		if (grammer<=30 && grammer>=0 && spelling<= 20 && spelling >=0 && content<=30 && 
				content>=0 && correctLength<= 20 && correctLength >=0 ) {
			valid = true;
		}
		
		//Sets valid scores
		if (valid == true) {
			double totalPoints = grammer + spelling +correctLength+content;
			setSpelling(spelling);
			setGrammer(grammer);
			setCorrectLength(correctLength);
			setContent(content);
			
			super.setScore(totalPoints);
				
			System.out.println("\nTerm Paper: ");
			System.out.println("Grammar Points: " + this.grammer);
			System.out.println("Spelling Points: "+ this.spelling);
			System.out.println("Length Points: "+ this.correctLength);
			System.out.println("Content Points: " + this.content);
			System.out.println("Total Points: "+ totalPoints);
			System.out.println("Grade: "+ super.getGrade());
		} 
		//Asks for different inputs b/c input was out of bounds
		else {
			System.out.println("Input for scores out of bounds. Please enter scores within the following range"
					+ "\n Grammar is from 0 points to 30 points"
					+ "\n Spelling is from 0 points to 20 points"
					+ "\n Correct Length is from 0 points to 20 points"
					+ "\n Content is from 0 points to 30 points ");
		}
	}	
	
	//Getters and Setters
	public double getGrammer() {
		return grammer;}
	public void setGrammer(double grammer) {
		this.grammer = grammer;}
	public double getSpelling() {
		return spelling;}
	public void setSpelling(double spelling) {
		this.spelling = spelling;}
	public double getCorrectLength() {
		return correctLength;}
	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;}
	public double getContent() {
		return content;}
	public void setContent(double content) {
		this.content = content;}
	
}
