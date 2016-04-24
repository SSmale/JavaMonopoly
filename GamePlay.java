

public class GamePlay {

	private PlayersList players;
	private PropertyList properties;
	private Player currentPlayer;
	private Property currentProperty;
	private Dice dice;
	private UtilitiesList utilities;
	private Utility currentUtility;

	private int owner;
	private int doublesCount=0;


	public GamePlay(){

		players = new PlayersList();
		properties = new PropertyList();
		utilities = new UtilitiesList();
		dice = new Dice();

		setCash();

		test(0);


	}
	public void jail(){
		//roll
		//pay
		//three rolls max
	}
	public void rollDice(int playerID){
		currentPlayer = players.getPlayer(playerID);
		if(currentPlayer.getPosition()==-1){
			jail();
		}
		else{
			dice.rollDice();
			if(doublesCount<2){
				if(dice.getDoubles()){
					doublesCount++;
					rollDice(playerID);
				}
			}
			else {
				currentPlayer.setPosition(-1);
			}
		}
	}
	public void playerPosition(int playerID){
		int diceValue=dice.getResult();
		currentPlayer = players.getPlayer(playerID);
		int oldPosition = currentPlayer.getPosition();
		currentPlayer.setPosition(oldPosition+diceValue);
	}
	public void setCash(){
		for (int i=0; i<players.size(); i++){
			currentPlayer = players.getPlayer(i);
			currentPlayer.setCash();
		}
	}
	public void passingGo(int playerID){
		currentPlayer = players.getPlayer(playerID);
		currentPlayer.setCashAdd(200);
	}
	public void buyProperty(int playerId, int propertyID){
		currentPlayer = players.getPlayer(playerId);
		currentProperty = properties.getProperty(propertyID);
		currentPlayer.setCashSubtract(currentProperty.getPurchaseValue());
		currentProperty.setOwner(playerId);
	}
	public void rent(int tennant, int propertyID){
		currentProperty = properties.getProperty(propertyID);
		owner = currentProperty.getOwner();
		currentPlayer = players.getPlayer(owner);
		currentPlayer.setCashAdd(currentProperty.getRent());
		currentPlayer = players.getPlayer(tennant);
		currentPlayer.setCashSubtract(currentProperty.getRent());
	}
	public void propertyOption(int playerID, int propertyID){
		currentProperty = properties.getProperty(propertyID);
		owner = currentProperty.getOwner();
		if (owner == -1){
			buyProperty(playerID, propertyID);
		}
		else{
			rent(playerID, propertyID);
		}
	}

	public void buyUtility(int playerId, int utilityID){
		currentPlayer = players.getPlayer(playerId);
		currentUtility = utilities.getUtility(utilityID);
		currentPlayer.setCashSubtract(currentUtility.getPurchaseValue());
		currentUtility.setOwner(playerId);
	}
	public void rentUtility(int tennant, int utilityID){
		currentUtility = utilities.getUtility(utilityID);
		owner = currentUtility.getOwner();
		currentPlayer = players.getPlayer(owner);
		int utilRent = currentUtility.getRent()*dice.getResult();
		currentPlayer.setCashAdd(utilRent);
		currentPlayer = players.getPlayer(tennant);
		currentPlayer.setCashSubtract(utilRent);
	}
	public void utilityOption(int playerID, int utilityID){
		currentUtility = utilities.getUtility(utilityID);
		owner = currentUtility.getOwner();
		if (owner == -1){
			buyUtility(playerID, utilityID);
		}
		else{
			rentUtility(playerID, utilityID);
		}
	}

	public static void main(String[] args) {

		new GamePlay();

	}


	public void test(int playerID){

		currentPlayer=players.getPlayer(playerID);
		rollDice(playerID);
		System.out.println(dice.getResult());
		System.out.println(currentPlayer.getPosition());



		/*		currentPlayer=players.getPlayer(0);
		System.out.println("p1"+currentPlayer.getCash());
		passingGo(0);
		System.out.println("p1"+currentPlayer.getCash());
		propertyOption(1,0);
		currentPlayer=players.getPlayer(0);
		System.out.println("p1"+currentPlayer.getCash());
		owner = currentProperty.getOwner();
		currentPlayer=players.getPlayer(owner);
		System.out.println(currentPlayer.getName());
		rent(0,0);
		currentPlayer=players.getPlayer(0);
		System.out.println(currentPlayer.getCash());*/
	}

	public void gameBoard(int playerID){
		currentPlayer=players.getPlayer(playerID);
		int playerPosition = currentPlayer.getPosition();
		if (playerPosition == 0){//go

		}
		else if (playerPosition == 1){//old kent road
			

		}
		else if (playerPosition == 2){//com chest

		}
		else if (playerPosition == 3){//whitechaple

		}
		else if (playerPosition == 4){//income tax £200

		}
		else if (playerPosition == 5){//kings cross

		}
		else if (playerPosition == 6){//angel islington

		}
		else if (playerPosition == 7){//chance

		}
		else if (playerPosition == 8){//euston

		}
		else if (playerPosition == 9){//pentonville

		}
		else if (playerPosition == 10){//visit jail

		}
		else if (playerPosition == 11){//pall mall

		}
		else if (playerPosition == 12){//ele comp

		}
		else if (playerPosition == 13){//whitehall

		}
		else if (playerPosition == 14){//northumberland

		}
		else if (playerPosition == 15){//marylebone station

		}
		else if (playerPosition == 16){//bow st

		}
		else if (playerPosition == 17){//com chest

		}
		else if (playerPosition == 18){//marlborough st

		}
		else if (playerPosition == 19){//vine st

		}
		else if (playerPosition == 20){//free parking

		}
		else if (playerPosition == 21){//strand

		}
		else if (playerPosition == 22){//chance

		}
		else if (playerPosition == 23){//fleet st

		}
		else if (playerPosition == 24){//trafalgar sq

		}
		else if (playerPosition == 25){//fenchurch st station

		}
		else if (playerPosition == 26){//leicester sq

		}
		else if (playerPosition == 27){//coventry st

		}
		else if (playerPosition == 28){//water works

		}
		else if (playerPosition == 29){//picidily

		}
		else if (playerPosition == 30){//toJail

		}
		else if (playerPosition == 31){//regent st

		}
		else if (playerPosition == 32){//oxford st

		}
		else if (playerPosition == 33){//com chest

		}
		else if (playerPosition == 34){//bond st

		}
		else if (playerPosition == 35){//liverpool st station

		}
		else if (playerPosition == 36){//chance

		}
		else if (playerPosition == 37){//park lane

		}
		else if (playerPosition == 38){//super tax £100

		}
		else if (playerPosition == 39){//mayfair

		}
		else if (playerPosition == -1){
			currentPlayer= players.getPlayer(playerID);
			currentPlayer.setPosition(-1);
			//jail
		}
		else {
			currentPlayer.setPosition(playerPosition-40);
			passingGo(playerID);
			gameBoard(playerID);
		}

	}

}
