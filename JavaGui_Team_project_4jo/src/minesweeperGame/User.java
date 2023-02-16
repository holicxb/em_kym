package minesweeperGame;

import java.io.Serializable;

public class User implements Serializable{

	private String name;
	private int timer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
	
}
