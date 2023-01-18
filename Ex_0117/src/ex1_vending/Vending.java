package ex1_vending;

public class Vending {

	private Can[] can = new Can[5];// *�ٽ�*//
	private int money;

	// �����ڸ� �̿��� ���Ǳ⿡ ������� ����(�ʱ�ȭ)
	public Vending() {
		can[0] = new Can("fanta", 1000);
		can[1] = new Can("latte", 1100);
		can[2] = new Can("coke", 900);
		can[3] = new Can("orange", 1200);
		can[4] = new Can("cider", 900);
	}

	// ����ڰ� �Է��� ������ �ݾ� �ȿ��� ���� �� �ִ� ���Ḹ ���
	public void showCans(int money) {
		this.money = money;

		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s - %d��\n", can[i].getCanName(), can[i].getPrice());
			}
		}

	}// showCans

	// ����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� �����ִ� �޼���
	public int outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				if (can[i].getCanName().equalsIgnoreCase(name)) {
					System.out.printf("%s��(��) ������\n", name);
					System.out.printf("�ܾ� : %d��\n", money -= can[i].getPrice());
				}
			} else {
				System.out.println("�ݾ��� �����մϴ�");
				System.out.printf("�ܾ� : %d��\n", money);
				return money;
			}//�ܾ��� �����ϴٰ� ������ ��µ�;;
		}
		return money;
	}

}
