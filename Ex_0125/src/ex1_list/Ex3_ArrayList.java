package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//추가 : abc
		//[abc]
		//추가 : aabb
		//[abc, aabb]
		//추가 : abc
		//중복된 아이디
		//추가 : exit
		//종료
		
		ArrayList<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		out : while(true) {
			System.out.print("추가 : ");
			String str = sc.next();
			
			//중복체크 1
//			for(int i = 0;	i < list.size();	i++) {
//				if(list.get(i).equalsIgnoreCase(str)) {
//					System.out.println("중복된 아이디");
//					continue out;//list.add에 접근하지 못하도록
//				}
//			}
			
			//중복체크 2
			if(list.contains(str)) {
				System.out.println("중복된 아이디");
				continue out;
			}
			
			if(str.equalsIgnoreCase("exit")) {
				System.out.println("종료");
				break;
			}
			list.add(str);
			System.out.println(list);
		}
	}// main

}
