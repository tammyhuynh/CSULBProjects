package project10;

public class DiscoverFactory extends CardFactory{
	//Initializing Variables
	int creditLimit;
	int annualCharge;
	
	//Overloaded constructor
	DiscoverFactory(int creditLimit, int annualCharge){
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}

	//Initializing proper Card
	@Override
	CreditCard GetCreditCard() {
		CreditCard disc = new DiscoverCreditCard(creditLimit, annualCharge);
		return disc ;
	}
}
