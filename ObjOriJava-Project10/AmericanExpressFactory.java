package project10;

public class AmericanExpressFactory extends CardFactory{
	//Initializing variables
	int creditLimit;
	int annualCharge;
	
	//Overloaded Constructor
	AmericanExpressFactory(int creditLimit, int annualCharge){
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}
	
	//Initializing proper Card
	@Override
	CreditCard GetCreditCard() {
		CreditCard amex = new AmericanExpressCreditCard(creditLimit, annualCharge);
		return amex;
	}
	
	
}
