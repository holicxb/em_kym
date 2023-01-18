package ex5_work_ans;

public class Vending {

	private Can[] can = new Can[5];//*�ٽ�*//
	private int money;
	
	//���Ǳ⿡ ������� ����(�ʱ�ȭ)�ϴ� �޼���
	public void canInit() {
	
		for(int i = 0;	i < can.length;	i++) {
			//�迭�� �� index�� �޸� �Ҵ�
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
	
	//����ڰ� �Է��� ������ �ݾ� �ȿ��� ���� �� �ִ� ���Ḹ ���
	public void showCans(int money) {
		this.money = money;
		
		for(int i = 0; i < can.length;	i++) {
			if(can[i].getPrice() <= money) {
				System.out.printf("%s - %d��\n",
						can[i].getCanName(), can[i].getPrice());
			}
		}
		
	}//showCans
	
	//����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� �����ִ� �޼���
	public int outCan(String name) {
		
		for(int i = 0;	i < can.length;	i++) {
			if(can[i].getCanName().equalsIgnoreCase(name)) {
				System.out.printf("%s��(��) ������\n", name);
				System.out.printf("�ܾ� : %d��\n", money -= can[i].getPrice());
			}
		}//for
		return money;
	}
	
	
}
