package ex7_work2;

public class Ex_class {

	private char[] abcCode = {'`', '~', '!', '@', '#',
			'$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', 
			'|', '[', ']', '{', '}', ';', ':', ',', '.', '/'
	};//a~z -> a�� ���� �迭 �ε��� ��ȣ�� ����(0 ~ )
	private char[] numCode = {'q', 'w', 'e', 'r', 't',
			'y', 'u', 'i', 'o', 'p'				
	};//0~9
	
	public String makeCode(String s, char code) {
		
		if(code >= 'a' && code <= 'z') {
			s += abcCode[code - 'a'];//�迭��ȣ�� 0~
		}
		else if(code >= '0' && code <= '9'){
			s += numCode[code-'0'];
		}else {
			s += code;
		}
		
		return s;
	}
}
