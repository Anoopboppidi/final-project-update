package SmartVendingMachine;


public class DrinkMenu {
 int numberofitems = 0;
 Drinks[] drinkmenu;
 
 public DrinkMenu () {
	 
	 drinkmenu = new Drinks(6);
	 drinkmenu[0] = new Energydrink();
	 drinkmenu[1] = new Mountaindew();
	 drinkmenu[2] = new Sprite();
	 drinkmenu[3] = new water();
	 drinkmenu[4] = new Pepsi();
	 drinkmenu[5] = new Coke();
	 drinkmenu[6] = new Lemonade();

 }
 
 public Iterator createIterator() {
		return new DrinkMenuIterator(drinkmenu);
	}
}
