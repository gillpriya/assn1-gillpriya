package ca.uvic.seng330.assn1;

/**
 * A Player belongs to a team.
 *
 */

public class Player {
	
	private Position position; 
	private int points;
	private String name;
	
	Player(String n, int p, Position pos){
		name = n;
		points = p;
		position = pos;
	}
	
	public int getPoints() {
		return points;
	}
	
	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}

}

