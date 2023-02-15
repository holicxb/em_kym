package minesweeperGame;

public class MakeGrid extends Thread {

	// ���̵����� ���� ���� ��ź���� �����ֱ�
	// �ʱ� : ���� 9, ���� 9, ���� 10��
	// �߱� : ���� 16, ���� 16, ���� 40��
	// ��� : ���� 30, ���� 16, ���� 99��

	// �� ���̵��� �´� ������� �׸��带 �����
	// ���ڸ� ���� ��ġ�Ѵ�(���ڴ� -1�� ���)
	// ���ڰ� �ƴ� ĭ���� �ֺ� ���� ���ڸ� ���� 1~8���� ���ڸ� ��ġ
//-----------------------------------------------------//
	// 0�� ��� Ŭ�� �� �پ��ִ� 0ĭ�� ���� �����Ѵ�(�ٸ� ���� ĭ ��������)
	// ���콺 ��Ŭ���� �� ĭ ����, ��Ŭ�� �� ���� ��� �ȱ�(���� �޸�), �� ���� ��� ����
	// ���� ��Ŭ�� �� ��� ���� ���°� �Բ� ���ӿ���

	// ������ ��� ��� ������ ���ΰ�

	private int row;
	private int col;
	private int mine;
	private int timer = 0;
	private boolean isPlaying = true;
	private String[][] grid;// ���ڰ� ����ִ� ��

	// ���ڿ� ����� ��ġ�� ������ ans ���ڸ� ���δ�
	// ����� ���� ���� flagcnt - ��Ų��
	// ans�� 0�� �Ǹ� play�� false�� �����Ѵ�
	// ���ڸ� Ŭ���� ��쿡�� play�� false�� �ȴ�

	// ȭ�鿡�� ��ư�� ������ ������� ���� ���� ����

	// ����ǥ �ʱ�ȭ �� ���� ����
	public void sMine() {
		isPlaying = true;
		grid = new String[row][col];

		// grid 0���� �ʱ�ȭ
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = "0";
			}
		}

		// grid ���� ���� ĭ�� *(����) ��ġ
		for (int i = 0; i < mine; i++) {
			int x = (int) (Math.random() * row);
			int y = (int) (Math.random() * col);

			if (grid[x][y].equals("*")) {
				i--;
				continue;
			}
			grid[x][y] = "*";
		}

		// �����ֺ��� ���� �ֱ�
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// ���ڰ� �ƴϰ� ���ڰ� 0�� �ƴ� ��
				if (countNum(i, j) != 0 && grid[i][j].equals("0")) {
					grid[i][j] = "";
					grid[i][j] += countNum(i, j);
					grid[i][j].trim();
				}
			}
		}
	}

	// ���� �ֺ� ���� ����
	// �� 0���� ä���� ���¿��� ���� -1�� ä���� ���·� ���� �ֺ����� ���ڸ� �ø��� ��.
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
		if (x < 0 || y < 0 || x >= row || y >= col) {// �׸��带 ����°�
			return false;
		}
		return (grid[x][y] == "*");
	}

	// 8�� ��ȸ�ϱ�
	// 1. �� [r-1][c] 2. �� [r+1][c]
	// 3. �� [r][c-1] 4. �� [r][c+1]
	// 5. �»� [r-1][c-1] 6. ��� [r-1][c+1]
	// 7. ���� [r+1][c-1] 8. ���� [r+1][c+1]

	// �ֿܼ� ���
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
		System.out.println("ǥ�õ� ���� ��" + count);
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
