package ca.uvic.seng330.assn1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	public int compare(Player p1, Player p2) {
		if (p1.getPoints() > p2.getPoints()) {
			return 1;
		} else if (p1.getPoints() < p2.getPoints()) {
			return -1;
		} else {
			return 0;
		}	
	}
}
