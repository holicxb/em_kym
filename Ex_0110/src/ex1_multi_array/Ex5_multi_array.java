package ex1_multi_array;

import java.util.*;
public class Ex5_multi_array {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//�л����� �̸�, ����, ���� ������ ����ϰ� �ѹ��� ����ϰ� �ʹ�.
		//����� ������ �Է��� ������ Ű���忡�� �޾Ƽ�
		//�л� ���� ��� �� ����� ����
		
		//��� �ο� : 2
		//�̸� : hong
		//���� : 90
		//���� : 87
		//----------
		//�̸� : kim
		//���� : 40
		//���� : 27
		//----------�Է�/���
		//2�� ��� �Ϸ�
		//hong	90	87
		//kim	40	27
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� �ο� : ");
		int n = scan.nextInt();//�� ���� ����� ���ΰ�
		
		String[] info = {"�̸� : ","���� : ","���� : "};
		String[][] str = new String[n][info.length];//**
		
		for(int i = 0;	i < str.length;	i++) {
			
			for(int j = 0;	j < str[i].length;	j++) {
				System.out.print(info[j]);//**
				str[i][j] = scan.next();
			}//inner
			System.out.println("-------------");
		}//outer
		
		System.out.println(n/*Ȥ�� str.length*/ + "�� ��� �Ϸ�");
		for(int i = 0;	i < str.length;	i++) {
			for(int j = 0;	j < str[i].length;	j++) {
				System.out.printf("%s\t",str[i][j]);
			}
			System.out.println();
		}
		
		
	}//main
}
