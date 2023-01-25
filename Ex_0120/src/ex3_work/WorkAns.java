package ex3_work;

public class WorkAns {
	public String isNumber(String str) {
		
		for(int i = 0;	i < str.length();	i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return str + "은 정수가 아니다";
			}
		}//for
		
		return str + "은 정수입니다";
	}//isNumber()
}
