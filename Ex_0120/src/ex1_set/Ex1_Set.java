package ex1_set;

import java.util.HashSet;

public class Ex1_Set {

	public static void main(String[] args) {
		//자바의 collection
		//다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
		
		//collection 클래스의 종류
		//1) List<>(ArrayList)
		//2) Set<>(HashSet, TreeSet)
		//3) Map<>(HashMap)
		
		//Set : 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(100);
		set1.add(30);//30은 이미 add된 값이기 때문에 새로 add 되지 않는다
		//순서는 보장하지 않음
		
		//set은 배열과 같이 index로 접근하는 것이 불가
		//대신 for문이 없어도 set이 가지고 있는 모든 내용을 통째로 출력하는 것은 가능
		System.out.println(set1);
		
		System.out.println(set1.size());
		//set은 index단위의 접근이 불가능
		//필요한 값만 뽑아서 쓰고 싶으면 배열에 옮겨 담아서 사용
		//set -> 배열
		Integer[] arr = set1.toArray(new Integer[0]);
		//0으로 사이즈 지정하면 알아서 칸을 배정함
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		set1.clear();
		System.out.println(set1.size());
	}
	
}
