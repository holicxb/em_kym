package ex2_map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {

	public static void main(String[] args) {
		
		HashMap<String, Character> map = new HashMap<String, Character>();
		map.put("k1", '��');
		map.put("k3", 'A');
		map.put("k2", 'B');
		map.put("k4", (char)65);
		
		System.out.println(map);
		
		//Map -> �迭
		Collection<Character> values = map.values();
		Character[] arr = values.toArray(new Character[0]);
		
		for(int i = 0; i < arr.length;	i++) {
			System.out.println(arr[i]);
		}
		//map���� B��� ���� ��� �ʹٸ�..
		Character res = map.get("k2");
		System.out.println("k2�� ���� �� : " + res);
		
	}//main
	
}
