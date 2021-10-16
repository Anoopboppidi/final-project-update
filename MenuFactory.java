package SmartVendingMachine;

import java.util.Scanner;


public class MenuFactory {

	
	public void chooseMenu() {
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("\n\n...SELECT MENU....\n\n"+
		"ENTER NUMBER EQUIVALENT TO YOUR MENU SELECTION" + 
		"1 SNACKS MENU" +
		"2 DRINKS MENU"+
		"3 HOME");
	
		int menuchoice = userinput.nextInt();
		if(menuChoice ==1) {
			
			SnacksMenu snacksmenu = new SnacksMenu();
			PrintsnacksMenu prntsnksmn = new PrintsnacksMenu(snacksmenu);
			prntsnksmn.printMenu();
			
		}
		else if(menuChoice ==2) {
			DrinkMenu drinksmenu = new DrinkMenu();
			PrintDrinkMenu prntdrkmn = new PrintDrinksMenu (drinksmenu);
			
			prntdrkmn.printMenu();
		}
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.posStatus(context);
		}
		
		Context context = new Context();
		
		FollowUpState followUp = new FollowUpState();
		followUp.posStatus(context);
	
	}
}
