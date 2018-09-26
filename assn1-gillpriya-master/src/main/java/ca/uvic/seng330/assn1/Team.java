package ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * a Team holds a List of Players and Managers.
 * @author Karan Tongay (karantongay@uvic.ca)
 * @author Andreas Koenzen 
 *
 */
public class Team implements Comparable<Team> {

	private ArrayList<Player> Players = new ArrayList<Player>();
	private int numOfPlayers = 0;
	private String name;
	
	Team(String s) {
		name = s;
	}

	@Override
	public int compareTo(Team t1) {
		if (this.getPoints() > t1.getPoints()) {
			return 1;
		} else if (this.getPoints() < t1.getPoints()) {
			return -1;
		} else {
		return 0;
		}
	}
	
	public int getPoints() {
	
		int totalPoints = 0;
		for (int i=0; i < getNumOfPlayers(); i++) {
			totalPoints += Players.get(i).getPoints();
		}
		return totalPoints;
	}
	
	public ArrayList<Player> sort() {
		Collections.sort(Players, new PlayerComparator());
		return Players;
	}
	
	public int getNumOfPlayers() {
		return numOfPlayers;
	}
	
	public void addPlayer(Player p) {
		Players.add(p);
		numOfPlayers++;
	}
	
	public void removePlayer(Player p) {
		Players.remove(p);
		numOfPlayers--;
	}
	
	@Override
	public String toString() {
	String s = "";
	s += this.name;
	s += " have ";
	s += Integer.toString(this.getPoints());
	s += " points";
	return s; 
	}

}
