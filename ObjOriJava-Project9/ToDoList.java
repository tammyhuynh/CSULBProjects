package project9;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {
	
	//Initializing field
	PriorityQueue <Task> list = new PriorityQueue<>();
	
	//adding to field
	public void addTask(String s) {
		Scanner read = new Scanner(s);
		try {
			//takes inputed string apart
			String action = read.next();
			String stringPriority = read.next();
			String description = read.nextLine();
			
			//changes string into int
			int priority = Integer.parseInt(stringPriority);
			
			//Varifies it is in range
			if (priority <=9 && priority >=1) {
				//creates a Task and adds it to the Queue
				Task toDo = new Task(priority, description);
				this.list.add(toDo);
			} else {
				System.out.println("The priority must be an integer between 1 and 9");
			}
		} catch (Exception e){
			System.out.println("The priority must be an integer between 1 and 9");
		}
	}
	// removing from field 
	public void nextTask() {
		// TODO Auto-generated method stub
		try {
			//Removes priority item on list
			System.out.println(this.list.remove());
		} catch (Exception e) {
			System.out.println("There are no tasks in the list.");
		}
	}
}
