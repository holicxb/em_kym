package defense_game;

public class Field {

	private boolean[][] isTower; // 9 X 17 보드 중 타워가 설치 된 곳 표시
	private boolean[][] isPass; // 내가 타워 설치시에 몬스터 경로를 막는지 검사하는 경로 배열
	private boolean[][] fastestPass; // 최단거리 경로 표시
	private boolean[][] route; // 내가 현재 경로 계산중인 인덱스들 표시
	private int[][] direction; // 상하좌우 현재 내가 움직이고 있는 방향 표시
	private int[][][] towerYX; // 해당 인덱스 좌표값의 타워 픽셀 값
	private int[] enter; // 몬스터가 나오는 부분
	private int[] exit; // 몬스터가 나가는 부분

	public Field() {
		this.towerYX = new int[9][17][2];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				this.towerYX[i][j][0] = i * 50;
				this.towerYX[i][j][1] = j * 50;

			}
		}
		this.isTower = new boolean[9][17];
		this.isPass = new boolean[9][17];
		this.fastestPass = null;
		this.route = new boolean[9][17];
		this.direction = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 4방향
		this.enter = new int[] { 0, 0 };
		this.exit = new int[] { 8, 16 };
	}

	public boolean[][] getRoute() {
		return route;
	}

	public void setRoute(boolean[][] route) {
		this.route = route;
	}

	public void isPassPoss(int x, int y) {
		if (x < 0 || y < 0 || x == 17 || y == 9) {

		} else if (x == 16 && y == 8) {
			isPass[y][x] = true;
			if (fastestPass == null) {
				setFastestPass();
			}
		} else {
			if (!isPass[y][x]) {
				isPass[y][x] = true;
				isPassPoss(x + 1, y);
				isPassPoss(x, y + 1);
				isPassPoss(x - 1, y);
				isPassPoss(x, y - 1);
			}
		}
	}

	// 울퉁불퉁한 벽 없애기
	public void fixRoute(boolean[][] towerMounted) {
		this.route = new boolean[towerMounted.length][towerMounted[0].length];
		for (int i = 0; i < towerMounted.length; i++) {
			for (int j = 0; j < towerMounted[0].length; j++) {
				this.route[i][j] = towerMounted[i][j];
			}
		}
		for (int i = 1; i < towerMounted.length - 1; i++) {
			for (int j = 1; j < towerMounted[0].length - 1; j++) {
				if (isPossibleRoute(i, j)) {
					this.route[i][j] = true;
				}
			}
		}
	}

	public boolean isPossibleRoute(int y, int x) {
		int count = 0;
		for (int i = 0; i < direction.length; i++) {
			try {
				int indexY = y + direction[i][0];
				int indexX = x + direction[i][1];
				if (this.route[indexY][indexX] == true) {
					count++;
				}
			} catch (Exception e) {
				count++;
			}
		}
		return count >= 3 ? true : false;
	}

	public boolean[][] getFastestPass() {
		return fastestPass;
	}

	public void setIsPass() {
		fastestPass = null;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				isPass[i][j] = isTower[i][j];
			}
		}
	}

	public void setFastestPass() {
		fastestPass = new boolean[9][17];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				fastestPass[i][j] = isPass[i][j];
			}
		}
	}

	public void setIsTower(int y, int x) {
		this.isTower[y][x] = !this.isTower[y][x];
	}

	public void setTowerYX(int[][][] towerYX) {
		this.towerYX = towerYX;
	}

	public void setEnter(int[] enter) {
		this.enter = enter;
	}

	public void setExit(int[] exit) {
		this.exit = exit;
	}

	public boolean[][] getIsTower() {
		return isTower;
	}

	public boolean[][] getIsPass() {
		return isPass;
	}

	public int[][][] getTowerYX() {
		return towerYX;
	}

	public int[] getEnter() {
		return enter;
	}

	public int[] getExit() {
		return exit;
	}

}
