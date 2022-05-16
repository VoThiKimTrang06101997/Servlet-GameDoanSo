package Model;

public class Player {
	private String name;
	private int timeGuess;
	
	public Player() {
		
	}
	
	public Player(String name, int timeGuess) {
		this.name = name;
		this.timeGuess = timeGuess;
	}
	
	/* getters and setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimeGuess() {
		return timeGuess;
	}

	public void setTimeGuess(int timeGuess) {
		this.timeGuess = timeGuess;
	}
}
