package project10;

public class DiscoverCreditCard  extends CreditCard{
	//Initializing Variables
	String cardType = "Discover";
	int creditLimit;
	int annualCharge;
	
	//Overloaded constructor
	DiscoverCreditCard(int creditLimit, int annualCharge){
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
	}
	
	//Overriding parent methods
	@Override
	String CardType() {
		return cardType;
		
	}
	@Override
	int CreditLimit() {
		return creditLimit;
	}
	@Override
	int AnnualCharge() {
		return annualCharge;
		
	}
}
