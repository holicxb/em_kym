package ex1_operator;

public class Ex5_work {

	public static void main(String[] args) {
		
		/*
		 ���) 
		 �Ϸ� ���귮 : 17��
		 �ð��� ��� : 0.7xxxxxx ��
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ�, �Ϸ� ���귮�� ����
		 5,7,5����.
		 
		 1) ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
		 2) �ѽð��� ��� ������ ����Ǵ��� ���
		 
		 #��, ������ ������ �Ϸ� ���귮�� ������ ������ int Ÿ��,
		 �ð��� ���� ���� ����� ������ float Ÿ������ ���� ��. 
		 ##���� ��������� �ּ� 2�� �̻��� �ڵ带 ¥�� ��
		 */
		
		//code #1
		//��, ���, ������ ����
		int pear = 5;
		int apple = 7;
		int orange = 5;
		//�Ϸ� ����, �ð��� ���귮 ����
		int total = 0;
		float hour = 0;
		
		total = pear + apple + orange;
		hour = (float)total / 24; //hour = total/24F
		System.out.println("code 1");
		System.out.println("�Ϸ� �� ���귮 : " + total);
		System.out.println("�ð� �� ���귮 : " + hour);
		
		//code #2
		int p = 5;
		int a = 7;
		int o = 5;
		
		int t = p + a + o;
		float h = t / 24f;
		System.out.println("code 2");
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� ���� : " + t + "\n�ð��� �����ϴ� ���� �� : " + h);
		
		//code #3
		System.out.println("code 3");
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� ���� : " + (p+a+o) + "\n�ð��� �����ϴ� ���� �� : " + (p+a+o)/24f);
		
	}//main
}
