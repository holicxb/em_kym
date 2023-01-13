package ex3_account;

public class Atm {

	private int money = 0;
	
	//입금

	public void pMoney(int money) {
		this.money += money;
		System.out.println("입금 성공");
	}
	
	//출금

	public int dMoney(int money) {
				
		if(this.money - money < 0) {
			System.out.println("출금 불가");
			return 0;
		}
		else {
			this.money -= money;

			System.out.println("출금 성공");
			return money;
		}
	}
	
	//잔액
	
	public void getMoney() {
		System.out.println("잔액 : " + money);
	}
	
}
