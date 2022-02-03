/**
 * 
 */
package project7;

/**
 * @author tammyhuynh
 *
 */
public class CourseGradesDemo {

	/**
	 * @param args
	 */
	//Main Method
	public static void main(String[] args) {
		//Step 1: Essay Class
		Essay termPaper = new Essay();
		termPaper.setScore(25, 18, 20, 25);
		
		//Step 2: Course Grades
		
		//Initializes GradedActivity Types from different classes
		GradedActivity aLab = new GradedActivity();
		aLab.setScore(85);
		PassFailExam test = new PassFailExam(20,3);
		Essay termPaper2 = new Essay();
		termPaper2.setScore(25, 18, 17, 20);
		FinalExam finalExam = new FinalExam(50,10);
		//Creates CourseGrades array type
		CourseGrades grades = new CourseGrades();
		//Sets GradedActivity into CourseGrades array
		grades.setEssay(termPaper2);
		grades.setFinalExam(finalExam);
		grades.setLab(aLab);
		grades.setPassFailExam(test);
		
		//Prints out toString method
		System.out.println("\n"+grades);
	}

}
