

public class Player {

	private String name;
	private int position;
	private int cash;
	
	public Player(String name, int position, int cash){
		this.name = name;
		this.position=position;
		this.cash=cash;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPosition(){
		return position;
	}
	public void setPosition(int newPosition){
		position = newPosition;
	}
	public int getCash(){
		return cash;
	}
	public void setCash(){
		cash = 1500;
	}
	public void setCashAdd(int newCashValue){
		cash += newCashValue;
	}
	public void setCashSubtract(int newCashValue){
		cash -= newCashValue;
		if (cash<0){
//ERROR OUT!
		}
		
	}
	
}