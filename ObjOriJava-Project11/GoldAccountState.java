package project11;

public class GoldAccountState extends AccountState{
	GoldAccountState(Account account){
		this.account = account;
		System.out.println("The account status is now: GoldAccountState");
	}
	
	public GoldAccountState(AccountState state) {
		super();
		System.out.println("The account status is now: GoldAccountState");
		account.setState(state);
	}

	@Override
	void Deposit(double amount) {
		account.setBalance(amount + account.getBalance());
		System.out.printf("Now the balance is: $%.2f\n",account.getBalance());
		stateChangeCheck();
	}

	@Override
	void Withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		System.out.printf("Now the balance is: $%.2f\n",account.getBalance());
		stateChangeCheck();
	}

	@Override
	void calculateInterest() {
		System.out.println("Gold State, interest amount will be applied!");
		double interest = 0.01/12;
		double numIntrest = interest * account.balance;
		account.balance = numIntrest+account.balance;
		System.out.printf("interest amount: $%.2f\n balance after interest: $%.2f\n",numIntrest,account.balance);
	}

	@Override
	void stateChangeCheck() {
		// TODO Auto-generated method stub
		account.stateChangeCheck();
	}

}
