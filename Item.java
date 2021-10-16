package SmartVendingMachine;

public abstract class Item {
     
	String itemName;
	double cost;
	String quantity;
	String description;
	
	public String getitemName (String itemName) {
		return itemName;	
		}
	
     public void setItemName (String itemName) {
    	 
    	 this.itemName = itemName;
     }
 
    	 
    
     public double getCost()
     {
    	 return cost;
    	    	 
     }  
     public void setCost(double cost) {
 		this.cost = cost;
     }
     public String getDescription () {
    	 return description;
    	 
     }
     
      public void setDescription(String getDescription)
      {
    	  this.description = getDescription;
    	  
  }	
    }

