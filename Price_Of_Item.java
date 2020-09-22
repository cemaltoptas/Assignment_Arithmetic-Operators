package assignment3;

public class Price_Of_Item {
	public static void main(String[ ] args) {
		
		// determines the change to be dispensed from a vending machine 
		 

	int priceInCent = 95 ;
	int change ;
	int quarters; 
	int dimes  ;
	int nickles ;
	
	change = 100-priceInCent;
	quarters = change/25;
	dimes =(change%25)/10 ;
	nickles =(change%25)/5 ;
	
	System.out.println("Price in cents : " + priceInCent);
	System.out.println("Your change is "+ quarters + ", quarters " + dimes + ", dimes " + "and " + nickles +" nickles");
	
	
	
		
		
		
		
	}
}
