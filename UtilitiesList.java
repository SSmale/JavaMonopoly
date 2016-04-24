import java.util.*;

public class UtilitiesList {

	private ArrayList<Utility> utilities = new ArrayList<Utility>();

	public UtilitiesList(){
		utilities.add(new Utility("Water Works", 150, -1, 4));
		utilities.add(new Utility("Electric Company", 150, -1, 4));
	}

	public Utility getUtility(int arrayPosition){
		int i=arrayPosition;
		return utilities.get(i);	
	}

}
