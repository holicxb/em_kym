package ex2_overload;

public class Bread {

	//�޼��� 1
	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	}
	
	//�޼��� 2
	public void makeBread(int n) {
		for(int i = 0;	i < n;	i++) {
			System.out.println("���� ��������ϴ�");
		}
		System.out.printf("%d���� ���� ��������\n", n);
	}
	
	//�޼��� 3
	public void makeBread(String bread, int n) {
		for(int i = 0;	i < n;	i++) {
			System.out.printf("%s��(��) ��������ϴ�\n", bread);
		}
		System.out.printf("%d���� %s��(��) ��������\n",n , bread);
	}
	
}
