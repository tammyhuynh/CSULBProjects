package project10;

public class VisaFactory extends CardFactory{
	//Initializing Variables
	int creditLimit;
	int annualCharge;
	
	//Overloaded constructor
	VisaFactory(int creditLimit, int annualCharge){
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
	}

	//Initializing proper Card
	@Override
	CreditCard GetCreditCard() {
		CreditCard visa = new VisaCreditCard(creditLimit, annualCharge);
		return visa;
	}
}
