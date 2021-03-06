package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameRecord {
	List<Player> playerList;
	
	public GameRecord() {
		this.playerList = new ArrayList<Player>();
	}
	
	public GameRecord(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public<T> List<Player> getPlayerList() {
		Collections.sort(playerList, new Comparator<Player> () {

			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				if (o1.getTimeGuess() > o2.getTimeGuess())
					return 1;
				else
					return -1;
			}
			
		});
		return playerList;
	}
	
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
}
