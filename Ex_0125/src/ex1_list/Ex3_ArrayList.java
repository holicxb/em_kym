package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//�߰� : abc
		//[abc]
		//�߰� : aabb
		//[abc, aabb]
		//�߰� : abc
		//�ߺ��� ���̵�
		//�߰� : exit
		//����
		
		ArrayList<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		out : while(true) {
			System.out.print("�߰� : ");
			String str = sc.next();
			
			//�ߺ�üũ 1
//			for(int i = 0;	i < list.size();	i++) {
//				if(list.get(i).equalsIgnoreCase(str)) {
//					System.out.println("�ߺ��� ���̵�");
//					continue out;//list.add�� �������� ���ϵ���
//				}
//			}
			
			//�ߺ�üũ 2
			if(list.contains(str)) {
				System.out.println("�ߺ��� ���̵�");
				continue out;
			}
			
			if(str.equalsIgnoreCase("exit")) {
				System.out.println("����");
				break;
			}
			list.add(str);
			System.out.println(list);
		}
	}// main

}
