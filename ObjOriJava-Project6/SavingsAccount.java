/**
 * 
 */
package project6;

import java.util.Scanner;
/**
 * @author tammyhuynh
 *
 */
public class SavingsAccount extends BankAccount{
	private boolean status;
	
	SavingsAccount(double balance, double interestRate, double monthlyCharges){
		super(balance,interestRate,monthlyCharges);
		if (balance <25) {
			this.status = false;
		} else {
			this.status = true;
		}
	}
	
	public void withdraw(double amount) {
		boolean want = true;
		if (!this.status) {
			System.out.println("Account Status: Inactive");
		}
		Scanner input = new Scanner(System.in);
		String answer;
		String y = "yes";
		while (this.status && want) {
			super.withdraw(amount);
			if (super.getBalance()<25) {
				status = false;
			}
			if (!this.status) {
				System.out.println("Account Status: Inactive");
				System.out.print("Did you want to deposit money to change status? ");
				if (input.next().equalsIgnoreCase(y)) {
					System.out.print("How much do you want to deposit? $");
					double in = input.nextDouble();
					deposit(in);
					break;
				} else {
					System.out.println("Thank you for your service. See you again soon!");
					break;
				}
			}
			System.out.printf("Do you want to make another Withdrawal? ");
			answer= input.next();
			if (answer.equalsIgnoreCase(y)) {
				want = true;
				System.out.print("How much do you want to withdraw? $");
				amount = input.nextDouble();
			} else {
				want = false;
			}
			if (!want) {
				break;
			} else {
				
			}
		}
		
	}
	public void deposit(double amount) {
		boolean want = true;
		double test = amount + super.getBalance();
		if (!status && test>=25) {
			status = true;
			System.out.println("Account Status Restored \nAccount Status: Active");
			super.deposit(amount);
		} if (!status && test < 25) {
			System.out.println("Account inactive: Must Deposit more until balance = $25 or more");
		}
		Scanner input = new Scanner(System.in);
		String answer;
		String y= "yes";
		while (status&& want) {
			if (amount < 0) {
				System.out.println("Please choose withdraw to take out cash");
				break;
			}
			super.deposit(amount);
			System.out.printf("Do you want to make another deposit? ");
			answer= input.next();
			if (answer.equalsIgnoreCase(y)) {
				want = true;
				System.out.print("How much do you want to deposit? $");
				amount = input.nextDouble();
			} else {
				want = false;
			}
			if (!want) {
				break;
			} else {
				
			}
		}
		
		
	}
	public void monthlyProcess() {
		if (super.getNumWithdrawals()> 4) {
			int num = super.getNumWithdrawals()-4;
			double monthlyCharges = super.getMonthlyServiceCharges()+num;
			super.monthlyProcess();
			super.withdraw(monthlyCharges);
		} else {
			super.monthlyProcess();
		}
		
		if (super.getBalance()<25) {
			status = false;
		} else {
			status = true;
		}
		
	}
}
