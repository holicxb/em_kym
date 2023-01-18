package ex5_work_ans;

public class Vending {

	private Can[] can = new Can[5];//*핵심*//
	private int money;
	
	//자판기에 음료수를 세팅(초기화)하는 메서드
	public void canInit() {
	
		for(int i = 0;	i < can.length;	i++) {
			//배열의 각 index를 메모리 할당
			can[i] = new Can();
		}
		
		can[0].setCanName("fanta");
		can[0].setPrice(1000);
		can[1].setCanName("latte");
		can[1].setPrice(1100);
		can[2].setCanName("coke");
		can[2].setPrice(900);
		can[3].setCanName("orange");
		can[3].setPrice(1200);
		can[4].setCanName("cider");
		can[4].setPrice(900);
		
	}//canInit
	
	//사용자가 입력한 범위의 금액 안에서 먹을 수 있는 음료만 출력
	public void showCans(int money) {
		this.money = money;
		
		for(int i = 0; i < can.length;	i++) {
			if(can[i].getPrice() <= money) {
				System.out.printf("%s - %d원\n",
						can[i].getCanName(), can[i].getPrice());
			}
		}
		
	}//showCans
	
	//사용자가 선택한 음료를 제공하고 잔액을 돌려주는 메서드
	public int outCan(String name) {
		
		for(int i = 0;	i < can.length;	i++) {
			if(can[i].getCanName().equalsIgnoreCase(name)) {
				System.out.printf("%s을(를) 선택함\n", name);
				System.out.printf("잔액 : %d원\n", money -= can[i].getPrice());
			}
		}//for
		return money;
	}
	
	
}
