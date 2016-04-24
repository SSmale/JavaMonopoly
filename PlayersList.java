import java.util.ArrayList;

public class PlayersList {

	private ArrayList<Player> players = new ArrayList<Player>();

	public PlayersList(){
		players.add(new Player("Player1", 0, 0));
		players.add(new Player("Player2", 0, 0));
	}

	public Player getPlayer(int arrayPosition){
		int i=arrayPosition;
		return players.get(i);	
	}

	public int size() {
		return players.size();
	}
}
