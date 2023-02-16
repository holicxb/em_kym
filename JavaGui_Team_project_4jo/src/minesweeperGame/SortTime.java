package minesweeperGame;

import java.util.Comparator;

public class SortTime implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.getTimer() > o2.getTimer()) return 1;
		else if(o1.getTimer() < o2.getTimer()) return -1;
		return 0;
	}

}
