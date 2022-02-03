package project5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;
	
	Employee(String n, String num, String date){
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);		
	}
	Employee(){
		name = "null Name";
		employeeNumber = "Null Employee Number";
		hireDate = "null Date";
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setEmployeeNumber(String e) {
		Scanner check = new Scanner(System.in);
		
		while (isValidEmpNum(e) == false) {
			System.out.println("Please enter a valid employee number! It should be in the format where"
					+ "\nXXX-L where X is a digit from 0 to 9 and L is a letter from a to m");
			e = check.next();
			isValidEmpNum(e);
			if (isValidEmpNum(e)==true) {
				check.close();
				break;
			}
		}
		this.employeeNumber = e;
	}
	public void setHireDate(String h) {
		this.hireDate = h;
	}
	public String getName() {
		return name;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	private boolean isValidEmpNum(String e) {
		boolean check = Pattern.matches("\\d\\d\\d-[a-m||A-M]",e);
		return check;
	}
	public String toString() {
		String smt="blue";
		return smt;
	}
}
