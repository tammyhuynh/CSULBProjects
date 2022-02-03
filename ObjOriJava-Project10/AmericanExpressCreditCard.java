package project10;

public class AmericanExpressCreditCard extends CreditCard{
	//Initializing Variables
	String cardType = "American Express";
	int creditLimit;
	int annualCharge;
	
	//Overloaded Constructor
	AmericanExpressCreditCard(int creditLimit, int annualCharge){
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
	}
	
	//Overriding Parent methods
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
