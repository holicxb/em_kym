package ex7_work2;
import java.util.Scanner;
public class Ex_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� ���� ��ȣǥ��� ��ȣȭ�Ͻÿ�
		//�� : abc123
		//��� : `~!wer
		
		Ex_class making = new Ex_class();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� : ");
		char[] code = scan.next().toCharArray();
		
		System.out.print("��� : ");
		String res = "";
		for(int i = 0;	i < code.length;	i++) {
			res = making.makeCode(res, code[i]);
		}
		System.out.println(res);
		
		
	}//main
}
