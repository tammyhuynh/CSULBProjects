/**
 * 
 */
package project11;

/**
 * @author tammyhuynh
 *
 */
public class RestrictedAccountState extends AccountState{
	RestrictedAccountState(Account account){
		this.account = account;
		System.out.println("Limited Operation!");
		System.out.println("The account status is now: RestrictedAccountState");
	}
	
	public RestrictedAccountState(AccountState state) {
		super();
		System.out.println("The account status is now: RestrictedAccountState");
	}

	@Override
	void Deposit(double amount) {
		account.setBalance(amount + account.getBalance());
		System.out.printf("Now the balance is: $%.2f\n",account.getBalance());
		stateChangeCheck();
	}

	@Override
	void Withdraw(double amount) {
		System.out.println("Account limit, withdrawal failed");
		System.out.printf("Now the balance is: $%.2f\n",account.getBalance());
		stateChangeCheck();
	}

	@Override
	void calculateInterest() {
		System.out.println("Restricted State, no interest applies!");
	}

	@Override
	void stateChangeCheck() {
		account.stateChangeCheck();
	}

}
