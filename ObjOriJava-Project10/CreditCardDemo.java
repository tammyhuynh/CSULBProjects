package project10;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author tammyhuynh
 *
 */
public class CreditCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//introducing program
		System.out.println("Welcome to Banking");
		System.out.println("=======================");
		Printing();
		
		Scanner in = new Scanner(System.in);
		
		//Taking in User Input
		String input = in.next();
		while (!input.equalsIgnoreCase("quit")) {
			//Instantiating specific Card Factories based on User Input
			if (input.equalsIgnoreCase("americanExpress")||input.equalsIgnoreCase("american Express")) {
				CardFactory card = new AmericanExpressFactory(500000,100);
				Details(card);
			} else if (input.equalsIgnoreCase("Discover")) {
				CardFactory card = new DiscoverFactory(50000,75);
				Details(card);
			} else if (input.equalsIgnoreCase("Visa")) {
				CardFactory card = new VisaFactory(100000,0);
				Details(card);
			} else {
				System.out.println("Error: not an option. try again");
			}
			Printing();
			input = in.next();
		}
		// Closing program and Scanner
		in.close();
		System.out.println("Exiting the program..Good bye");
		
		
		
	}
	
	//Printing methods
	public static void Printing() {
		System.out.println("");
		System.out.println(" AmericanExpress");
		System.out.println(" Visa");
		System.out.println(" Discover");
		System.out.println(" Quit");
		System.out.println("");
		System.out.print("Enter the card type you would like to visit: ");
	}
	public static void Details(CardFactory card) {
		CreditCard info = card.GetCreditCard();
		System.out.println("Card Type: "+info.CardType());
		System.out.println("Credit Limit: $"+info.CreditLimit());
		System.out.println("Annual Charge: $"+info.AnnualCharge());
	}
	

}
