package ex3_work;

public class WorkAns {
	public String isNumber(String str) {
		
		for(int i = 0;	i < str.length();	i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return str + "�� ������ �ƴϴ�";
			}
		}//for
		
		return str + "�� �����Դϴ�";
	}//isNumber()
}
