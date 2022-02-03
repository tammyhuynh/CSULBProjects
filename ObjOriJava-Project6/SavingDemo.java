/**
 * 
 */
package project6;

import java.util.Scanner;
/**
 * @author tammyhuynh
 *
 */

public class SavingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create a SavingsAccount object with a $100 balance, "
				+ "3% interest rate, and a monthly service charge of $2.50");
		
		SavingsAccount collegeFunds = new SavingsAccount(100, 0.03, 2.5); 
		Scanner input = new Scanner(System.in);
		
		System.out.printf("  Balance: $%.2f\n  Number of deposits: %d\n  Number of  withdrawals: %d\n",
				collegeFunds.getBalance(), collegeFunds.getNumDeposits(), collegeFunds.getNumWithdrawals());
		
		boolean want = true;
		
		while(want) {
			System.out.print("\nDo you want to perform a transaction? ");
			String answer = input.next();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.print("\nDo you want to make a deposit or withdrawal? ");
				String answer2 = input.next();
				if (answer2.equalsIgnoreCase("deposit")) {
					System.out.print("\nHow much do you want to deposit? $");
					double in = input.nextDouble();
					collegeFunds.deposit(in);
					Display(collegeFunds);
				} else if (answer2.equalsIgnoreCase("withdrawal")) {
					System.out.print("\nHow much do you want to withdraw? $");
					double out = input.nextDouble();
					collegeFunds.withdraw(out);
					Display(collegeFunds); 
				} else {
					System.out.print("\nError: wrong input");
				}
			} else {
				System.out.print("\nDo you want to see Account Information? ");
				String answer3 = input.next();
				if (answer3.equalsIgnoreCase("yes")) {
					Display(collegeFunds);
				} else {
					System.out.println("Thank you for your service. See you again soon!");
					want = false;
					break;
				}
			}
		}
		
		System.out.println("\nDoing the monthly processing.");
		collegeFunds.monthlyProcess();
		Display(collegeFunds);
		
		input.close();
	}
	
	public static void Display(SavingsAccount collegeFunds) {
		System.out.println("\nDisplay what we've done so far.");
		System.out.printf("  Balance: $%.2f\n  Number of deposits: %d\n  Number of withdrawals: %d\n",
				collegeFunds.getBalance(), collegeFunds.getNumDeposits(), collegeFunds.getNumWithdrawals());
		
	}

}
