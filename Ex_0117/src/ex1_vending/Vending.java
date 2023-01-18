package ex1_vending;

public class Vending {

	private Can[] can = new Can[5];// *핵심*//
	private int money;

	// 생성자를 이용해 자판기에 음료수를 세팅(초기화)
	public Vending() {
		can[0] = new Can("fanta", 1000);
		can[1] = new Can("latte", 1100);
		can[2] = new Can("coke", 900);
		can[3] = new Can("orange", 1200);
		can[4] = new Can("cider", 900);
	}

	// 사용자가 입력한 범위의 금액 안에서 먹을 수 있는 음료만 출력
	public void showCans(int money) {
		this.money = money;

		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s - %d원\n", can[i].getCanName(), can[i].getPrice());
			}
		}

	}// showCans

	// 사용자가 선택한 음료를 제공하고 잔액을 돌려주는 메서드
	public int outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				if (can[i].getCanName().equalsIgnoreCase(name)) {
					System.out.printf("%s을(를) 선택함\n", name);
					System.out.printf("잔액 : %d원\n", money -= can[i].getPrice());
				}
			} else {
				System.out.println("금액이 부족합니다");
				System.out.printf("잔액 : %d원\n", money);
				return money;
			}//잔액이 부족하다고 여러번 출력됨;;
		}
		return money;
	}

}
