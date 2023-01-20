package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		//로또번호 코드
		HashSet<Integer> hs = new HashSet<Integer>();
		Random rnd = new Random();
		while(true) {
			int v = rnd.nextInt(45) + 1;
			hs.add(v);
			if(hs.size() == 6) {
				break;
			}
		}
		System.out.println(hs);
		
		//중복을 허용하지 않으면서
		//오름차순으로 정렬까지 해줌
		TreeSet<Integer> ts = new TreeSet<>();
		while(ts.size() != 6) {
			int n = rnd.nextInt(45) + 1;
			ts.add(n);
		}
		System.out.println(ts);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("홍길동");
		ts2.add("apple");
		ts2.add("pineapple");
		ts2.add("banana");
		ts2.add("헝길똥");
		
		System.out.println(ts2);
		
	}//main
}
