package minesweeperGame;

public class MakeGrid extends Thread {

	// 난이도별로 가로 세로 폭탄개수 정해주기
	// 초급 : 가로 9, 세로 9, 지뢰 10개
	// 중급 : 가로 16, 세로 16, 지뢰 40개
	// 고급 : 가로 30, 세로 16, 지뢰 99개

	// 각 난이도에 맞는 사이즈로 그리드를 만들고
	// 지뢰를 랜덤 배치한다(지뢰는 -1로 기록)
	// 지뢰가 아닌 칸에는 주변 지뢰 숫자를 세어 1~8까지 숫자를 배치
//-----------------------------------------------------//
	// 0의 경우 클릭 시 붙어있는 0칸을 같이 공개한다(다른 숫자 칸 이전까지)
	// 마우스 좌클릭은 한 칸 열기, 우클릭 한 번은 깃발 꽂기(지뢰 메모), 두 번은 깃발 해제
	// 지뢰 좌클릭 시 모든 지뢰 오픈과 함께 게임오버

	// 벽면의 경우 어떻게 생각할 것인가

	private int row;
	private int col;
	private int mine;
	private int timer = 0;
	private boolean isPlaying = true;
	private String[][] grid;// 지뢰가 들어있는 판

	// 지뢰와 깃발의 위치가 같으면 ans 숫자를 줄인다
	// 깃발을 꽂을 수록 flagcnt - 시킨다
	// ans가 0이 되면 play를 false로 변경한다
	// 지뢰를 클릭할 경우에도 play는 false가 된다

	// 화면에서 버튼을 누르면 사이즈와 지뢰 수를 정함

	// 지뢰표 초기화 후 지뢰 세팅
	public void sMine() {
		isPlaying = true;
		grid = new String[row][col];

		// grid 0으로 초기화
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = "0";
			}
		}

		// grid 랜덤 숫자 칸에 *(지뢰) 배치
		for (int i = 0; i < mine; i++) {
			int x = (int) (Math.random() * row);
			int y = (int) (Math.random() * col);

			if (grid[x][y].equals("*")) {
				i--;
				continue;
			}
			grid[x][y] = "*";
		}

		// 지뢰주변에 숫자 넣기
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// 지뢰가 아니고 숫자가 0이 아닐 때
				if (countNum(i, j) != 0 && grid[i][j].equals("0")) {
					grid[i][j] = "";
					grid[i][j] += countNum(i, j);
					grid[i][j].trim();
				}
			}
		}
	}

	// 지뢰 주변 숫자 세팅
	// 다 0으로 채워둔 상태에서 지뢰 -1을 채워둔 상태로 지뢰 주변에만 숫자를 늘리면 됨.
	public int countNum(int x, int y) {
		// (-1,-1) (-1,0) (-1,1)
		// (0,-1) (0,0) (0,1)
		// (1,-1) (1,0) (1,1)
		int minecount = 0;
		if (existNum(x - 1, y - 1)) {
			minecount++;
		}
		if (existNum(x - 1, y)) {
			minecount++;
		}
		if (existNum(x - 1, y + 1)) {
			minecount++;
		}
		if (existNum(x, y - 1)) {
			minecount++;
		}
		if (existNum(x, y + 1)) {
			minecount++;
		}
		if (existNum(x + 1, y - 1)) {
			minecount++;
		}
		if (existNum(x + 1, y)) {
			minecount++;
		}
		if (existNum(x + 1, y + 1)) {
			minecount++;
		}

		return minecount;
	}

	public boolean existNum(int x, int y) {
		if (x < 0 || y < 0 || x >= row || y >= col) {// 그리드를 벗어나는가
			return false;
		}
		return (grid[x][y] == "*");
	}

	// 8방 순회하기
	// 1. 상 [r-1][c] 2. 하 [r+1][c]
	// 3. 좌 [r][c-1] 4. 우 [r][c+1]
	// 5. 좌상 [r-1][c-1] 6. 우상 [r-1][c+1]
	// 7. 좌하 [r+1][c-1] 8. 우하 [r+1][c+1]

	// 콘솔에 출력
	public void printMine() {

		int count = 0;
		sMine();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j].equals("*")) {
					count++;
				}
//				System.out.print(grid[i][j]);
			}
//			System.out.println();
		}
		System.out.println("표시된 지뢰 수" + count);
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setMine(int mine) {
		this.mine = mine;
	}

	public String[][] getGrid() {
		return grid;
	}

	public int getRow() {
		return row;
	}

	public int getMine() {
		return mine;
	}

	public int getTimer() {
		return timer;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	@Override
	public void run() {
		while (isPlaying) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
