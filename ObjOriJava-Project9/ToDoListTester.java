package project9;

import java.util.Scanner;

public class ToDoListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tester for inputing items
		
		ToDoList list = new ToDoList();
		System.out.println("Adding the following 6 items to the list");
		System.out.println("\"add 1 Complete Programming Exercise 15.11\"");
		System.out.println("\"add 8 Read for tomorrow's class\"");
		System.out.println("\"add 3 Soccer practice\"");
		System.out.println("\"add 6 Call parents\"");
		System.out.println("\"add 5 Have dinner with friends\"");
		System.out.println("\"add 9 Sleep well\"");
		
		list.addTask("add 1 Complete Programming Exercise 15.11");
		list.addTask("add 8 Read for tomorrow's class");
		list.addTask("add 3 Soccer practice");
		list.addTask("add 6 Call parents");
		list.addTask("add 5 Have dinner with friends");
		list.addTask("add 9 Sleep well");
		
		System.out.println();

		System.out.println("Entering 'Add bad command'");
		list.addTask("add bad command");

		System.out.println("Expected: The priority must be an integer between 1 and 9.");
		System.out.println();
		
		System.out.println("Pulling most Urgent items out");
		list.nextTask();
		System.out.println("Expected: Complete Programming Exercise 15.11");
		list.nextTask();
		System.out.println("Expected: Soccer practice");
		list.nextTask();
		System.out.println("Expected: Have Dinner");
		list.nextTask();
		System.out.println("Expected: Call parents");
		list.nextTask();
		System.out.println("Expected: Read for tomorrow's class");
		list.nextTask();
		System.out.println("Expected: Sleep well");
		list.nextTask();
		System.out.println("Expected: There are no tasks in the list.");
		
		System.out.println();
		
		//UserInput toDo tester
		System.out.println("To Do List - Please enter an option"
				+ "\n   add priority description (add a new task)"
				+ "\n   next (remove and print most urgent task)"
				+ "\n   quit (exit this program)");
		

		System.out.println();
		// Initializing variables
		ToDoList list2 = new ToDoList();
		Scanner input = new Scanner(System.in);
		String firstChoice;
		
		//User input stage (adding and removing tasks depending on priority) 
		do {
			System.out.print("> ");
			firstChoice = input.next();
			if (firstChoice.equalsIgnoreCase("add")) {
				String secondChoice = input.nextLine();
				secondChoice = "add "+secondChoice;
				list2.addTask(secondChoice);
			} else if (firstChoice.equalsIgnoreCase("next")) {
				list2.nextTask();
			} else if (!firstChoice.equalsIgnoreCase("quit")){
				System.out.println("That is not a choice. Please select again");
			}

		} while (!firstChoice.equalsIgnoreCase("quit"));
		
		System.out.println("Press any key to continue  .  .  .");
		input.close();
	}

}
