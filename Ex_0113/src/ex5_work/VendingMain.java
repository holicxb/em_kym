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
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Vending[] v = new Vending[4];
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
			if(coin >= v[i].getWon()) {
				System.out.println(v[i].getCan() + " - " + v[i].getWon());
//				v[count++].setCan(v[i].getCan());
//				v[count++].setWon(v[i].getWon());
			}
		}
		
		//��� �߿� ���� �����ϱ�
		System.out.print(">> ");
		String myPick = scan.next();
		
		//������ ���ᰡ �ִ��� ������ �Ǵ��Ͽ� �����Ͽ����� ���
		for(int i = 0;	i < v.length;	i++) {
			
			
		}
		
		
		//�ܾ� ���
		
		
		
		
		
	}//main
	
}
