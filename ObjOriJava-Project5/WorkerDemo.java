package project5;

import java.util.Scanner;

public class WorkerDemo extends ProductionWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Here's the first production worker.");
		ProductionWorker first = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1,16.5);
		
		String s;
		if (first.getShift()==1) {
			s = "Day Shift";
		} else {
		 	s = "Night Shift";
		}
		
		System.out.println("Shift: "+ s);
		System.out.println("Hourly Pay Rate: $"+ first.getPayRate());
		
		
		System.out.println("Demonstrating the input validation ...");

		ProductionWorker second = new ProductionWorker();
		
	}

}
