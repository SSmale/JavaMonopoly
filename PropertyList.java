import java.util.*;

public class PropertyList {

	private ArrayList<Property> properties = new ArrayList<Property>();

	public PropertyList(){
		properties.add(new Property("Old Kent Road", 60, -1, 2));
		properties.add(new Property("Whitechapel Road", 60, -1, 4));
		properties.add(new Property("Kings Cross Station", 200, -1, 25));
		properties.add(new Property("The Angel, Islington", 100, -1, 6));
		properties.add(new Property("Euston Road", 200, -1, 6));
		properties.add(new Property("Pentonville Road", 120, -1, 8));
		properties.add(new Property("Pall Mall", 140, -1, 10));
		properties.add(new Property("Whitehall", 140, -1, 10));
		properties.add(new Property("Northumberland Avenue", 160, -1, 12));
		properties.add(new Property("Marylebone Station", 200, -1, 25));
		properties.add(new Property("Bow Street", 180, -1, 14));
		properties.add(new Property("Marlborough Street", 180, -1, 14));
		properties.add(new Property("Vine Street", 200, -1, 16));
		properties.add(new Property("Strand", 220, -1, 18));
		properties.add(new Property("Fleet Street", 220, -1, 18));
		properties.add(new Property("Trafalgar Square", 240, -1, 20));
		properties.add(new Property("Fenchurch Street Station", 200, -1, 25));
		properties.add(new Property("Leicester Square", 260, -1, 22));
		properties.add(new Property("Coventry Street", 260, -1, 22));
		properties.add(new Property("Piccadilly", 280, -1, 24));
		properties.add(new Property("Regent Street", 300, -1, 26));
		properties.add(new Property("Oxford Street", 300, -1, 26));
		properties.add(new Property("Bond Street", 320, -1, 28));
		properties.add(new Property("Liverpool Street Station", 200, -1, 25));
		properties.add(new Property("Park Lane", 350, -1, 35));
		properties.add(new Property("Mayfair", 400, -1, 50));
	}

	public Property getProperty(int arrayPosition){
		int i=arrayPosition;
		return properties.get(i);	
	}

}
