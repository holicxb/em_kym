package ex6_exception_work;
import java.util.Scanner;
public class Work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Ű���忡�� ������ �ް� 
		//�������� ������ �ƴ��� �Ǵ��Ͻÿ�
		
		//���� : 10
		//��� : 10
		//���� : aaa
		//aaa�� ������ �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String str = sc.next();
		try {
			int num = Integer.parseInt(str);
			System.out.println("��� : " + num);
		} catch (Exception e) {
			System.out.println(str + "��(��) ������ �ƴմϴ�");
		}
		
	}//main
}