package ex1_multi_array;

import java.util.*;
public class Ex5_multi_array {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//학생들의 이름, 수학, 영어 성적을 등록하고 한번에 출력하고 싶다.
		//몇명의 정보를 입력할 것인지 키보드에서 받아서
		//학생 정보 등록 및 출력을 진행
		
		//등록 인원 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//----------
		//이름 : kim
		//수학 : 40
		//영어 : 27
		//----------입력/출력
		//2명 등록 완료
		//hong	90	87
		//kim	40	27
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등록 인원 : ");
		int n = scan.nextInt();//몇 명을 등록할 것인가
		
		String[] info = {"이름 : ","수학 : ","영어 : "};
		String[][] str = new String[n][info.length];//**
		
		for(int i = 0;	i < str.length;	i++) {
			
			for(int j = 0;	j < str[i].length;	j++) {
				System.out.print(info[j]);//**
				str[i][j] = scan.next();
			}//inner
			System.out.println("-------------");
		}//outer
		
		System.out.println(n/*혹은 str.length*/ + "명 등록 완료");
		for(int i = 0;	i < str.length;	i++) {
			for(int j = 0;	j < str[i].length;	j++) {
				System.out.printf("%s\t",str[i][j]);
			}
			System.out.println();
		}
		
		
	}//main
}
