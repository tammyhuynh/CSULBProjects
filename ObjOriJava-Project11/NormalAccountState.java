package project11;

public class NormalAccountState extends AccountState{
	NormalAccountState(Account account){
		this.account = account;
		System.out.println("The account status is now: NormalAccountState");
	}
	
	public NormalAccountState(AccountState state) {
		super();
		System.out.println("The account status is now: NormalAccountState");
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
		System.out.println("Normal State, no interest applies!");
	}

	@Override
	void stateChangeCheck() {
		// TODO Auto-generated method stub
		account.stateChangeCheck();
	}
	
}
