/**
 * 
 */
package project11;

/**
 * @author tammyhuynh
 *
 */
public class Account {
	AccountState state;
	String owner;
	double balance;
	
	Account(String owner, double init){
		this.owner = owner;
		this.balance = init;
		stateChangeCheck();
		
	}
	
	void Deposit(double amount){
		state.Deposit(amount);
	}
	
	void Withdraw(double amount) {
		state.Withdraw(amount);
	}
	
	void calculateInterest() {
		state.calculateInterest();
	}
	void stateChangeCheck() {
		if (getBalance()<=0) {
			state = new RestrictedAccountState(this);
		} else if (getBalance()>0 && getBalance()<20000) {
			state = new NormalAccountState(this);
		} else if (getBalance()>= 20000) {
			state = new GoldAccountState(this);
		}
		System.out.println("-------------------------------------------------");
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	void setState(AccountState state) {
		this.state = state;
	}
	
}
