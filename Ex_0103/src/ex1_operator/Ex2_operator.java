package ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		
		//�񱳿�����
		//���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		
		int n1 = 10;
		int n2 = 20;
		
		boolean res;
		res = n1 < n2;//true
		System.out.println("n1 < n2 : " + res);
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res);
		
		res = n1 == n2;
		System.out.println("n1 == n2 : " + res);
		
		res = n1 != n2;
		System.out.println("n1 != n2 : " + res);
		
		//**��������
		//�񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
		int age =  30;
		int limit = 35;
		//and(&&) ������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�
		//t && t = t
		//t && f = f
		//f && t = f
		//f && f = f
		res = (limit - age) < 5 && (age += 2) >= 30;
		System.out.println("&& : " + res);
		System.out.println(age);//���� �����̶� && ���� �ڵ带 �������� ����
		
		int i1 = 10;
		int i2 = 20;
		//or(||)������ : ���� ������ ���� ��� ���� ������ �������� �ʴ´�
		//t || t = t
		//t || f = t
		//f || t = t
		//f || f = f
		res = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| : "+ res);
		
		//not ������ : ���� �������� ������ ������ �ٲ��ִ� ������
		//boolean �������� ���� ��
		System.out.println("!������ : " + res);
		System.out.println("!������ : " + !res);
		//!�����ڴ� ���������� ����
		System.out.println(res);
		
	}
}
