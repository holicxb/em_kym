package ex4_method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		
		Ex1_param e1 = new Ex1_param();
		String str = "�ȳ�";
		e1.test1(str);
		//���� �ѱ�
		System.out.println("main : " + str);
		
		int[] arr = {1,2,3};
		e1.test2(arr);
		//�ּҸ� �ѱ�
		for(int i = 0;	i < arr.length;	i++) {
			System.out.println(arr[i]);
		}
		
	}//main
}
