package project9;

import java.util.Objects;
import java.util.PriorityQueue;

public class Task implements Comparable<Task> {
	//Initializing fields
	int priority;
	String description;
	
	//overloaded constructor
	Task(int priority,String description){
	       this.priority=priority;
	       this.description=description;
	   }
	
	// Getters and setters
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Methods overidden
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task todo = (Task) o;
        return Double.compare(todo.priority, priority) == 0 &&
                Objects.equals(description, todo.description);
    }
	@Override
    public int hashCode() {
        return Objects.hash(priority, description);
    }
	@Override
	 public String toString(){
	       return this.description;
	   }
	@Override
	public int compareTo(Task todo) {
        if(this.getPriority() > todo.getPriority()) {
            return 1;
        } else if (this.getPriority() < todo.getPriority()) {
            return -1;
        } else {
            return 0;
        }
	}
}
