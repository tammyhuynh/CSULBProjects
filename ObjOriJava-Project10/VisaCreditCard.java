package project10;

public class VisaCreditCard extends CreditCard{
	//Initializing Variables
	String cardType = "Visa";
	int creditLimit;
	int annualCharge;
	
	//Overloaded Constructor
	VisaCreditCard(int creditLimit, int annualCharge){
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
