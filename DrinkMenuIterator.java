package SmartVendingMachine;


public class DrinkMenuIterator implements Iterator {

	Drinks[] drinksMenu;
	int position;
	
	public DrinkMenuIterator(Drinks[] drinksMenu) {
		this.drinksMenu = drinksMenu;
	
	}
	public boolean hasNext() {
		if(position > drinksMenu.length || drinksMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Drinks next() {
		Drinks drinksMenusmart = (Drinks) drinksMenu[position];
		position = position +1;
		
		return drinksMenusmart;
	}
    
	}


