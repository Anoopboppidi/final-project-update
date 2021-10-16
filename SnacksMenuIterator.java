package SmartVendingMachine;

public class SnacksMenuIterator implements Iterator {
	Snacks[] snacksmenu;
	int position;
	
	public SnacksMenuIterator(Snacks[] snacksmenu) {
		
		
		
	}
	
	public boolean hasNext() {
		if(position > snacksmenu.length || snacksmenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Snacks next() {
		Snacks snacksMenusmart = (Snacks) snacksmenu[position];
		position = position +1;
		
		return snacksMenusmart;
	}

}
