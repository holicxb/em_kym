package ex3_work;

public class Ex1_work {

	
	public static void main(String[] args) {
		
		//�迭 arr�� ����ִ� ��� ���� ���� ����Ͻÿ�
		//��� : 67
		
		//����� ������ �ʱ�ȭ���� �� �ٷ� ����
		//int[] arr = {10, 24, 7, 16, 10};
		
		//����� ������ ���ٷ� ǥ���� �� �ִ�.
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 24;
		arr[2] = 7;
		arr[3] = 16;
		arr[4] = 10;
		
		int total = 0;
		for(int i = 0;	i < arr.length;	i++) {
			total += arr[i];
		}
		System.out.println("��� : " + total);
		
		System.out.println("------------------");
		char[] cArr = {'J', 'A', 'V', 'A', '!'};
		//char[] cArr = new char[4];
		//cArr[0] = J;
		//...
		//for(int i = 0;	i < cArr.length;	i++) {
		//	System.out.println(cArr[i]);
		//}
		
		//������ roof(���� for ��)
		//�迭�� ��� ��� ���뿡 �����ϰ��� �ϴ� �������� ������� for��
		for(char c : cArr) {
			System.out.println(c);
		}
		
	}//main
}
