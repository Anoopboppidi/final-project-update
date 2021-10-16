package SmartVendingMachine;

public class SnacksMenu {
 int numberofitems = 0;
 Snacks[] snacksmenu;
 

 
 public SnacksMenu () {
	 
	 
	 snacksmenu = new Snacks(3);
	 snacksmenu[1] = new Sunchips();
     snacksmenu[2] = new Granolabar();
     snacksmenu[3] = new Snickerbar();
     
     
 }
 public Iterator createIterator() {
	return null;
}
}
