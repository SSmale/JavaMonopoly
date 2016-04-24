
public class Utility {

	private String name;
	private int purchaseValue;
	private int owner;
	private int rent;
	
	public Utility(String name, int purchaseValue, int owner, int rent){
		this.name = name;
		this.purchaseValue = purchaseValue;
		this.owner = owner;
		this.rent = rent;
		
	}	
	public String getName(){
		return name;
	}
	public int getPurchaseValue(){
		return purchaseValue;
	}
	public int getOwner(){
		return owner;
	}
	public int getRent(){
		return rent;
	}
	public void setOwner(int playerID){
		owner = playerID;
	}
}
