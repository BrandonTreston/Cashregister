// this is a cash register using the notes taken in class
public class Cashregister {
	public Cashregister () {
		purchase = 0;
		payment = 0;
		
	}
	public void recordpurchase (double amount) 
	{
		purchase = (purchase + amount); //type is also double
	}
	
	public void enterpayment (double dollars, double quarters, double dimes, double nickels, double pennies)
	{
		payment = dollars + quarters * quartersValue + dimes * dimesValue + nickels * nickelsValue + pennies * penniesValue; //these are variable declarations
	}
	public double givechange() 
	
	{
				double change = payment - purchase;
				purchase = 0;
				return change;
	
	}
		public static final double quartersValue = .25;    // these are the initialization of the variables
		public static final double dimesValue = .10;
		public static final double nickelsValue = .05;
		public static final double penniesValue = .10;
		
		private double purchase;
		private double payment;
			
			
}

