package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//makeBread() 1�� ȣ�� ��
		//���� ��������ϴ� ���
		bread.makeBread();
		System.out.println("------------");
		//makeBread() 2�� ȣ�� ��
		//�޼��带 �ѹ��� �ҷ��� ���� ���ϴ� ������ŭ ���� ����
		//���� ��������ϴ� 
		//���� ��������ϴ� 
		//���� ��������ϴ� 
		
		bread.makeBread(3);
		System.out.println("------------");
		
		//makeBread() 3�� ȣ�� ��
		//���ϴ� ���� �� �� ������� �˷���� ��
		//ũ������ ��������ϴ�
		//ũ������ ��������ϴ�
		//2���� ũ������ ��������
		bread.makeBread("���ϻ�", 2);
		System.out.println("-------------");
		
		
	}//main
	
}
