package SmartVendingMachine;

import java.util.Scanner;

public class CheckoutState implements State{
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		SnacksMenu snacksCashOutMenu = new SnacksMenu();
		DrinkMenu drinksCashOutMenu = new DrinkMenu();
		
		System.out.print("This is a current place holder for the checkout state.");
		
		FollowUpState followUp = new FollowUpState();
		followUp.posStatus(context);
		context.setState(this);
	}

}
