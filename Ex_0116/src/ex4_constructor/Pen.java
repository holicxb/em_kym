package ex4_constructor;

public class Pen {

	private String brand;
	private String color;
	private int price;
	//임의로 생성자를 만드는 순간부터 기본 생성자는 없어짐
	//기본 생성자와 오버로드된 생성자를 쓰고 싶으면
	//기본 생성자도 만들어줘야 함
	//보안 강화
	//실수로 빼먹은 정보를 놓치지 않을 수 있다
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
	}
	
	public Pen() {
//		System.out.println("Pen의 생성자");
		brand = "monami";
		color = "black";
		price = 500;
	}
	
	public void result() {
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("-----------------");
	}

}
