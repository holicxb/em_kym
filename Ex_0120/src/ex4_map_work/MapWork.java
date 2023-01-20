package ex4_map_work;

import java.util.HashMap;
import java.util.Scanner;

public class MapWork {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//"아이디", 비밀번호
		//id : kim (입력)
		//pw : 3333 (입력)
		//비밀번호 불일치
		
		//id : lim
		//pw : 1234
		//아이디가 존재하지 않습니다
		
		//id : park
		//pw : 2222
		//로그인 성공!
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("park", 2222);
		map.put("lee", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");//key
		String id = sc.next();
		System.out.print("pw : ");//value
		int pw = sc.nextInt();
		
		if(map.containsKey(id)) {
			if(pw != map.get(id)) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인 성공");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}
		
		
	}//main
}
