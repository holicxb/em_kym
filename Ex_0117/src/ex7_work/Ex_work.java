package ex7_work;
import java.util.*;
public class Ex_work {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� ���� ��ȣǥ��� ��ȣȭ�Ͻÿ�
		//�� : abc123
		//��� : `~!wer
		
		char[] abcCode = {'`', '~', '!', '@', '#',
				'$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', 
				'|', '[', ']', '{', '}', ';', ':', ',', '.', '/'
		};
		char[] numCode = {'q', 'w', 'e', 'r', 't',
				'y', 'u', 'i', 'o', 'p'				
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� : ");
		String str = scan.next();
		
		System.out.print("��� : ");
		String res = "";
		for(int i = 0;	i < str.length();	i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				res += abcCode[str.charAt(i) - 'a'];//�迭��ȣ�� 0~
			}
			else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				res += numCode[str.charAt(i)-'0'];
			}else {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println(res);
	}//main
}
