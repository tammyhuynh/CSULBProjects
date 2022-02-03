/**
 * 
 */
package project6;

/**
 * @author tammyhuynh
 *
 */

public abstract class BankAccount {
	private double balance;
	private int numDeposits;
	private int numWithdrawals;
	private double interestRate;
	private double monthlyServiceCharge;
	
	BankAccount(double balance, double interestRate, double monthlyServiceCharge){
		this.balance = balance;
		this.interestRate = interestRate;
		this.monthlyServiceCharge = monthlyServiceCharge;
		getBalance();
		getInterestRate();
		getMonthlyServiceCharges();

	}
	
	public void deposit(double amount){
		this.balance = this.balance + amount;
		numDeposits++;
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		numWithdrawals++;
	}
	private void calcInterest() {
		double monthlyInterestRate =  interestRate/12;
		double monthlyInterest = this.balance* monthlyInterestRate;
		this.balance = this.balance +monthlyInterest;
	}
	public void monthlyProcess() {
		this.balance = this.balance- this.monthlyServiceCharge;
		calcInterest();
		if (this.numWithdrawals>4) {
			this.numWithdrawals = -1;
		} else {
			this.numWithdrawals = 0;
		}
		this.numDeposits = 0;
		this.monthlyServiceCharge = 0;
	}
	public double getBalance () {
		return this.balance;
	}
	public int getNumDeposits() {
		return this.numDeposits;
	}
	public int getNumWithdrawals() {
		return this.numWithdrawals;
	}
	public double getInterestRate () {
		return this.interestRate;
	}
	public double getMonthlyServiceCharges () {
		return this.monthlyServiceCharge;
	}
}
