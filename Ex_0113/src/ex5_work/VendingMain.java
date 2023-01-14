package ex5_work;
import java.util.*;
public class VendingMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//���Ǳ�
		//���� �Է��� �ݾ����� �� �� �ִ� ���� ��ϸ� ���
		//���Ḧ �����ϸ� ���� �� �ܾ� ��ȯ
		
		//insert coin : 1000
		//fanta - 1000
		//coke - 900
		//sider - 900
		//>> coke
		//coke (��)�� �����ϼ̽��ϴ�
		//�ܾ� : 100��
		
		Scanner scan = new Scanner(System.in);
		Vending[] v = new Vending[4];
		Vending[] canDrink = new Vending[4];
		//�迭 ����� ���߿� ���� ���� ����?
		//�̸� 4�� ���ϴ� ��� null ������ �߻���
		int count = 0;
		//���� ���
		
		for(int i = 0;	i < v.length;	i++) {
			v[i] = new Vending();
		}
		
		v[0].setCan("fanta");
		v[0].setWon(1000);
		v[1].setCan("coke");
		v[1].setWon(900);
		v[2].setCan("sider");
		v[2].setWon(900);
		v[3].setCan("water");
		v[3].setWon(1500);
		
		//���� �ֱ�
		System.out.print("insert coin : ");
		int coin = scan.nextInt();
		
		//�ݾ׺��� ���� ���� �Ǵ��Ͽ� ����ϱ�
		for(int i = 0;	i < v.length;	i++) {
			canDrink[i] = new Vending();
			canDrink[i].setCan("");
			canDrink[i].setWon(0);
			if(coin >= v[i].getWon()) {
				canDrink[count].setCan(v[i].getCan());
				canDrink[count].setWon(v[i].getWon());
				System.out.println(canDrink[count].getCan() + " - " + canDrink[count].getWon());
				count++;
			}
		}
		
		//��� �߿� ���� �����ϱ�
		System.out.print(">> ");
		String myPick = scan.next();
		boolean exist = false;
		//������ ���ᰡ �ִ��� ������ �Ǵ��Ͽ� �����Ͽ����� ���
		for(int i = 0;	i < canDrink.length;	i++) {
			if(myPick.equalsIgnoreCase(canDrink[i].getCan())) {
				System.out.println(canDrink[i].getCan() + " ��(��) �����ϼ̽��ϴ�");
				System.out.println("�ܾ� : " + (coin - canDrink[i].getWon()));
				exist = true;
			}
		}
		if(exist == false) {
			System.out.println("�ش������ ���� �Ұ�");
		}
	}//main
	
}
