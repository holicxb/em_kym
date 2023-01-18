package ex6_static;

public class Bank {

	private String point;
	private String tel;
	
	//객체가 아무리 많이 생성되어도 static 변수는 메모리에 딱 한 개만 만들어진다.
	static float interest;
	
	public Bank(String point, String tel) {
		
		this.point = point;
		this.tel = tel;
		interest = 10f;
		
	}
	
	public void getResult() {
		System.out.println("지점 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("------------------------");
	}
	
}


//stack |			heap		 	|		static
//	객체	|	static영역의 값을 참조		|	딱 하나만 만들어짐
//객체가 아무리 많이 만들어져도 static키워드 변수들은 메모리에 딱 하나만 만들어진다