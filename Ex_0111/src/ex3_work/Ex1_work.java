package ex3_work;
import java.util.*;
public class Ex1_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� �ƹ����̳� �Է¹ް� �ҹ��� a�� ������ ���
		//�Է� : alsdijfJISEDFG...&^(*&%^asjdl
		//a�� ���� : n��
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String input = scan.next();
		int i;
		
		int count = 0;
		String[] cut = input.split("a");
		for(i = 0;	i < cut.length;	i++) {
			count++;
		}
		System.out.printf("a�� ���� : %d\n", count-1);
		
		System.out.println("-----------------");
		count = 0;
		//�Է¹��� ���ڿ��� ���̸�ŭ for�� �ݺ�
		for(i = 0;	i < input.length();	i++) {
			//a�� ã�Ƴ� ������ ī��Ʈ ����
			if(input.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.printf("a�� ���� : %d\n", count);
		System.out.println("-----------------");
		
		
		
	}//main
	
}
