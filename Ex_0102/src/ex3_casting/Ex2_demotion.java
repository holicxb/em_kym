package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
	
		//2.����
		// - ���� �ڷ����� ū �ڷ����� ���ԵǴ� ��(�ڵ�X)
		
		char c = 'C';//2byte
		int n = c + 1;//4byte -> 68
		c = (char)n; // �����Ǵ� �ƽ�Ű�ڵ� ���
		System.out.println(c);
		
		float ff = 5.5F;//4.xx byte
		n = 0;//4byte
		n = (int)ff;
		System.out.println(n);
		
	}//main
}
