package ex5_interface;

public interface AllMenu extends Menu1 ,Menu2, Menu3{

	//인터페이스들 간에는 extends 키워드를 통해 서로 상속이 가능
	//인터페이스는 다중 상속이 가능함
	
	//Menu1을 상속 받았다면 짜장, 짬뽕 추상 메서드까지 AllMenu에서 사용할 수 있게됨을 의미
	//jjajang();
	//jjambbong();
	
	String rajogi();
	
}
