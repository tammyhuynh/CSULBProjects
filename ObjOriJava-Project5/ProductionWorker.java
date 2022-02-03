package project5;

import java.util.Scanner;

public class ProductionWorker extends Employee{
	private int shift;
	private double payRate;
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;
	
	ProductionWorker(String n, String num, String date, int sh, double rate){
		Employee details = new Employee(n,num,date);
		details.setName(n);
		details.setEmployeeNumber(num);
		details.setHireDate(date);
		setShift(sh);
		setPayRate(rate);
		System.out.println("Name: "+ details.getName());
		System.out.println("Employee Number: "+ details.getEmployeeNumber());
		System.out.println("Hire Date: "+ details.getHireDate());
	}
	ProductionWorker(){
		shift = 0;
		payRate = 0.00;
		Employee nullDetails = new Employee();
		

		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the employee's Name: ");
		String name = enter.nextLine();
		nullDetails.setName(name);
		
		System.out.println("Enter the employee's number: ");
		String employeeNum = enter.next();
		nullDetails.setEmployeeNumber(employeeNum);
		
		System.out.println("Enter the employee's Hire Date: ");
		nullDetails.setHireDate(enter.next());
		
		System.out.println("Enter the employee's shift (Day = 1, Night = 2): ");
		setShift(enter.nextInt());
		
		System.out.println("Enter the employee Pay Rate");
		setPayRate(enter.nextDouble());
		

		String s;
	
		if (getShift()==1) {
			s = "Day Shift";
		} else {
		 	s = "Night Shift";
		}
		
		System.out.println("Name: "+ nullDetails.getName());
		System.out.println("Employee Number: "+ nullDetails.getEmployeeNumber());
		System.out.println("Hire Date: "+ nullDetails.getHireDate());
		System.out.println("Shift: "+ s);
		System.out.println("Hourly Pay Rate: $"+ getPayRate());
		
		enter.close();
		
		
	}
	public void setShift(int s) {
		Scanner check = new Scanner (System.in);
		while (s != 1 && s !=2) {
			System.out.println("Sorry not a valid Shift. Enter 1 for day shift or enter 2 for night shift.");
			try {
				s = check.nextInt();
			} catch (Exception e){
				System.out.println("Sorry, that was not a number. Please enter a number");
				s = 0;
			}
		}
		check.close();
		this.shift = s;
	}
	public void setPayRate(double p) {
		this.payRate = p;
	}
	public int getShift() {
		return shift;
	}
	public double getPayRate() {
		return payRate;
	}
	public String toString() {
		return "no";
	}
}
