package defense_game;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
	private String nickName; // 랭킹보드에 입력할 닉네임
	private int score; // 점수
	private int clearTime; // 클리어 타임

	public User(String nickName, int score, int clearTime) {
		this.nickName = nickName;
		this.score = score;
		this.clearTime = clearTime;
	}

	public String getNickName() {
		return nickName;
	}

	public int getScore() {
		return score;
	}

	public int getClearTime() {
		return clearTime;
	}

}
