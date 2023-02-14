package ex8_work;

import java.io.Serializable;

public class RspUser implements Serializable{

	private String id;
	private int win = 0;
	private int lose = 0;
	private int samsam = 0;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getSamsam() {
		return samsam;
	}
	public void setSamsam(int samsam) {
		this.samsam = samsam;
	}
	
}
