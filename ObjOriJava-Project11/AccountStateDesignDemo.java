/**
 * 
 */
package project11;

/**
 * @author tammyhuynh
 *			Balance
 *				- (0< x <20000) then status is Normal
 *						can deposit and withdraw
 *						no interest
 *				- (x<= 0) then status is Restricted
 *						can deposit but not withdraw
 *						no interest
 *				- (x >=20000) status is Gold
 *						can deposit and withdraw
 *						interest
 *			StateChangeCheck() method is used to determine whether to make or withdraw operation 
 *			according to balance after each withdrawal
 *
 */
public class AccountStateDesignDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tom Zank";
		System.out.println(name+ ": Open an account with an initial amount of 0.0");
		Account bank = new Account(name,0);
		System.out.println(name+ ": Open an account with an initial amount of 0.0");
		System.out.println(name+ " deposited $3000.0");
		bank.Deposit(3000);
		System.out.println(name+ " deposited $2000.0");
		bank.Deposit(2000);
		System.out.println(name+ " deposited $5000.0");
		bank.Deposit(5000);

		bank.calculateInterest();
		
		System.out.println(name+ " withdraw money : $10000.0");
		bank.Withdraw(10000);
		System.out.println(name+ " withdraw money : $11000.0");
		bank.Withdraw(11000);
		System.out.println(name+ " deposited $20000.0");
		bank.Deposit(20000);
		
		bank.calculateInterest();
		
		System.out.println(name+ " deposited $1500.0");
		bank.Deposit(1500);
		
	}

}
