package ex3_work;

import java.util.*;

public class Ex2_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ȸ���� �Ǵ��ϱ�
		//ȸ������ ������ �о �ڿ��� �о �Ȱ��� ������ ����
		//ȸ�� : ���ָ������ּ�....�ⷯ�� �쿵�� �丶��.. 12321...
		
		//�� : a1221a
		//a1221a ��(��) ȸ�����Դϴ�.
		//�� : abc
		//abc ��(��) ȸ������ �ƴմϴ�. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� : ");
		String input = scan.next();//�Ǵ��ϰ��� �Է¹���
		boolean p = true;
		int length = input.length();
		for(int i = 0;	i < length/2;	i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				p = false;
			}else {
				p = true;
			}
		}
		if(p == true) {
			System.out.printf("%s��(��) ȸ���Դϴ�\n", input);
		}else {
			System.out.printf("%s��(��) ȸ���� �ƴմϴ�\n", input);
		}
		
		System.out.println("-------------------------------");
		
		//������ ��°�� ����� ������ ���ϴ� ���
		String rev = "";//������ ������ ����
		//���� null�� �ʱ�ȭ�ϸ� �̾���� �� null�� ����ȭ ���ѹ���
		
		for(int i = input.length()-1;	i >= 0;	i--){
			rev += input.charAt(i);//�ٽ��ڵ� 
			//String�� +=�� ��� �̾���̱�
		}
		if(!input.equals(rev)) {//���� ������
			System.out.printf("%s��(��) ȸ���� �ƴմϴ�\n", input);						
		}else {
			System.out.printf("%s��(��) ȸ���Դϴ�\n", input);			
		}
		
		
		
	}//main
	
}
