package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//"���̵�", ��й�ȣ
		//id : kim (�Է�)
		//pw : 3333 (�Է�)
		//��й�ȣ ����ġ
		
		//id : lim
		//pw : 1234
		//���̵� �������� �ʽ��ϴ�
		
		//id : park
		//pw : 2222
		//�α��� ����!
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("park", 2222);
		map.put("lee", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");//key
		String id = sc.next();
		System.out.print("pw : ");//value
		int pw = sc.nextInt();
		
		if(map.containsKey(id)) {
			if(pw != map.get(id)) {
				System.out.println("��й�ȣ ����ġ");
			}else {
				System.out.println("�α��� ����");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}
		
		System.out.println("------------------------");
		if(!map.containsKey(id)) {//id��(Ű����) �������� �ʴ� ���� �޾Ҵ°� 
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}else {
			//���̵�� �����ϴ� ���
			//Ű���忡�� ���� ���̵�� Ű���� ��ġ�ϴ� value���� �����ͼ� pwd�� ��
			if(pw != map.get(id)) {
				System.out.println("��й�ȣ ����ġ");
			}else {
				System.out.println("�α��� ����");
			}
		}
	}//main
}
