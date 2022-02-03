/**
 * 
 */
package project11;

/**
 * @author tammyhuynh
 *
 */
public abstract class AccountState {
	Account account;
	
	abstract void Deposit(double amount);
	abstract void Withdraw(double amount);
	abstract void calculateInterest();
	abstract void stateChangeCheck();
}
