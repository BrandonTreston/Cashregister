import java.util.Scanner;

public class InputTester {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		try {
		
		Cashregister register = new Cashregister();
		System.out.print("enter price:");
			double price = input.nextDouble();
			double sTax = price * .08;  //.08 is the New York Sales tax, which is around 8%
			double total = price + sTax;
			System.out.println("Your total is:");
			System.out.println(total);
		register.recordpurchase(total);
	
		System.out.print("enter dollars: ");      //tells you to input amount of money
			double dollars = input.nextDouble();
		System.out.print("enter quarters: ");
			double quarters = input.nextDouble();
		System.out.print("enter dimes: ");
			double dimes = input.nextDouble();
		System.out.print("enter nickels: ");
			double nickels = input.nextDouble();
		System.out.print("enter pennies: ");
			double pennies = input.nextDouble();
		
			register.enterpayment(dollars, quarters, dimes, nickels, pennies);
		System.out.print("Change: ");
		System.out.println(register.givechange());
		}finally {
			input.close();
		}
		
		
	}
}
