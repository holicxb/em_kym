package ex1_string;

public class Ex2_String_Method {

	public static void main(String[] args) {
		
		//String 클래스의 메서드(기능)들
		//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
		//반복적으로 사용되는 코드를 줄이기 위해 쓰는 개념
		
		String name = "Hong Gil Dong";
		int len = name.length();//메서드는 ()를 가짐
		System.out.println("문장의 길이 : " + len);//띄어쓰기 포함한 모든 글자의 수
		
		int index = name.indexOf('o');//앞에 있는 '문자'의 위치를 찾아냄
		System.out.println("맨 첫번째 o의 위치 : " + index);
		
		index = name.lastIndexOf('o');//맨 뒤의 '문자'의 위치를 찾아냄
		System.out.println("맨 뒤의 o의 위치 : " + index);
		
		char c = name.charAt(5); //해당 인덱스의 문자를 추출
		System.out.println("추출한 문자 : " + c);
		
		String s1 = name.substring(5);//잘라냄. n번 부터 모든 문장을 잘라냄
		System.out.println("5번째 위치부터의 모든 문장을 잘라내시오 : " + s1);
		
		s1 = name.substring(5, 10);//n1~n2-1번째의 문장을 잘라냄
		System.out.println("5번째부터 9번째까지의 문장을 잘라내시오 : " + s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');
		System.out.println(".을 /로 치환" + s1);
		
		name = name.replace("on", "ii");
		System.out.println("on을 ii로 치환 : " + name);
		
		name = name.replaceAll("ii", "on");
		System.out.println("ii를 on으로 치환 : " + name);
		
		name = "Kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		name = name.replace('.', '/');
		System.out.println("replace : " + name);
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll : " + name2);
		//.이 있으면 그 앞문장을 한 묶음으로 인지
		
		String id = " hi hello ";//의미가 없는 공백이 생길 수 있다
		System.out.println(id);
		id = id.trim();//문장 앞 뒤의 의미 없는 공백을 제거
		System.out.println("trim을 사용한 후 길이 : " + id.length());
		System.out.println(id);
		
		String[] id2 = id.split(" ");//특정 문장을 기준으로 배열 형태로 나눠서 저장해주는 메서드
		System.out.println(id2[0] + " / " + id2[1]);
		
		String answer = "Apple";
		if(answer.equals("apple")) {//대소문자가 다르면 값이 다르다고 판단
			System.out.println("값이 같다");
		}
		if(answer.equalsIgnoreCase("apple")) {
			System.out.println("값이 같다");
		}
		
		//스트링 클래스의 메서드는 아니지만 앞으로 많이 사용하게 될 메서드
		String num = "10";
//		num += 1; //11이 되지 않음 101처럼 보임
		
		//정수 형태의 문자열(String)을 연산이 가능한 실제 정수로 바꿔보자!
		int a = Integer.parseInt(num);
		System.out.println(a + 1);
		
	}//main
	
}
