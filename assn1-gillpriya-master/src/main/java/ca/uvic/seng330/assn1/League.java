package ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class League implements Iterable<Team> {

	private ArrayList<Team> Teams = new ArrayList<Team>();
	private String name;
	private int numOfTeams = 0;
	
	League(String s) {
		name = s;
	}
	
	public void addTeam(Team t) {
		Teams.add(t);
		numOfTeams++;
	}
	
	public void removeTeam(Team t) {
		Teams.remove(t);
		numOfTeams--;
	}
	
	@Override
	public Iterator<Team> iterator() {
		return new leagueIterator<Team>(Teams);
	}
	
	class leagueIterator<Team> implements Iterator<Team> {

		int i = 0;
		ArrayList<Team> listOfTeams;
		
		leagueIterator(ArrayList listOfTeams) {
			this.listOfTeams = listOfTeams;
		}
		
		@Override
		public boolean hasNext() {
			if (listOfTeams.size() >= (i + 1)) {
				return true;
			}
			return false;
		}

		@Override
		public Team next() {
			Team t = listOfTeams.get(i);
			i++;
			return t;
		}
		
	}
	
	public ArrayList<Team> sort() {
		Collections.sort(Teams);
		return Teams;
	}
}
