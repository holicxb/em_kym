package defense_game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DataBase extends JFrame {
	private String[] towerName;
	private int[][] towerAtackSpeed;
	private int[][] towerRange;
	private int[][] towerDemage;
	private ImageIcon[][] towerImg;
	private String[][] towerUpgradePrice;
	private String[] stageName;
	private int[] stageMount;
	private String[] stageMonName;
	private int[] stageMonMoney;
	private int[] stageMonHp;
	private int[] stageMonSpeed;
	private ImageIcon[] monImg;

	public DataBase() {

		// Tower ------------------------------------------------------------
		towerName = new String[] { "Cannon", "Normal", "Magic" };
		towerAtackSpeed = new int[][] { { 0, 1, 2, 3 }, { 0, 2, 2, 3 }, { 0, 1, 1, 2 } };
		towerRange = new int[][] { { 0, 1, 1, 2 }, { 0, 2, 2, 2 }, { 0, 3, 3, 4 } };
		towerDemage = new int[][] { { 0, 2, 4, 6 }, { 0, 2, 4, 6 }, { 0, 4, 6, 8 } };
		towerImg = new ImageIcon[3][7];
		towerUpgradePrice = new String[][] { { "2", "6", "8", "불가" }, { "6", "8", "12", "불가" },
				{ "8", "11", "14", "불가" } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				// 0 : 공격모션, 1 ~ 3 포탑 레벨
				String path = "imgSet/towers/" + towerName[i] + j + ".png";
				towerImg[i][j] = new ImageIcon(path);
			}
		}
		// Stage ------------------------------------------------------------
		stageName = new String[5];
		stageMount = new int[5];
		// Monster ----------------------------------------------------------
		stageMonHp = new int[5];
		monImg = new ImageIcon[5];
		stageMonName = new String[] { "블링키", "잉키", "핑키", "클라이드", "고스트" };
		stageMonMoney = new int[] { 2, 2, 2, 3, 4 };
		for (int i = 0; i < 5; i++) {
			stageName[i] = "[" + (i + 1) + "]stage";
			stageMount[i] = (i + 1) * 12;
			stageMonHp[i] = (i + 1) * 8 + 2;
			String path = "imgSet/monsters/" + stageMonName[i] + ".png";
			monImg[i] = new ImageIcon(path);
		}
		stageMonSpeed = new int[] { 2, 2, 3, 3, 4 };
	}

	public int[] getStageMonMoney() {
		return stageMonMoney;
	}

	public String[] getTowerName() {
		return towerName;
	}

	public int[][] getTowerAtackSpeed() {
		return towerAtackSpeed;
	}

	public int[][] getTowerRange() {
		return towerRange;
	}

	public int[][] getTowerDemage() {
		return towerDemage;
	}

	public String[][] getTowerUpgradePrice() {
		return towerUpgradePrice;
	}

	public ImageIcon[][] getTowerImg() {
		return towerImg;
	}

	public String[] getStageName() {
		return stageName;
	}

	public int[] getStageMount() {
		return stageMount;
	}

	public String[] getStageMonName() {
		return stageMonName;
	}

	public int[] getStageMonHp() {
		return stageMonHp;
	}

	public int[] getStageMonSpeed() {
		return stageMonSpeed;
	}

	public ImageIcon[] getMonImg() {
		return monImg;
	}
}
