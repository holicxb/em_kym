package ex3_single_for;

public class Ex1_for {

	public static void main(String[] args) {
		//�ݺ��� : Ư�� ���๮�� ������ �ݺ��� �� �ֵ��� ���ִ� ���
		//for(�ʱ��;	���ǽ�;	������){
		//	���ǽ��� ���� ��� ����Ǵ� ����
		//}
		
		for(int i = 0;/*��������:for������ ������� �������� i�� for���� �Ҽ��̹Ƿ� ������ ����� ��� �Ұ�*/
				i < 3;	i++) {
			System.out.println(i);
		}
		int n = 0;//��������
		
		for (n = 1; n <= 3; n++) {
			System.out.println("n : " + n);
		}
		System.out.println(n);
		System.out.println("------------------------");
		for(int i = 10;	i > 0;	i--) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		//1~100���� 100ȸ���� �ϴ� for���� �����,
		//3�� ����� ��� �غ���
		for(int i = 1;	i < 101; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------");
		
		for(int i = 3;i <= 100;	i += 3) {
			System.out.println(i);
		}
		
		
		
		
	}//main
}
