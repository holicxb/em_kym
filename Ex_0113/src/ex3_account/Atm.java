package ex3_account;

public class Atm {

	private int money = 0;
	
	//�Ա�

	public void pMoney(int money) {
		this.money += money;
		System.out.println("�Ա� ����");
	}
	
	//���

	public int dMoney(int money) {
				
		if(this.money - money < 0) {
			System.out.println("��� �Ұ�");
			return 0;
		}
		else {
			this.money -= money;

			System.out.println("��� ����");
			return money;
		}
	}
	
	//�ܾ�
	
	public void getMoney() {
		System.out.println("�ܾ� : " + money);
	}
	
}
