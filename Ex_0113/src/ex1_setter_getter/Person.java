package ex1_setter_getter;

public class Person {

	//setter & getter : private으로 만들어진 속성들에 접근할 수 있도록 하기 위한 개념
	
	private String brand = "samsung";
	private String name;
	private String phone;
	private int age;
	
	//변동이 없어야하면 getter만 만들기
	public String getBrand() {
		return brand;
	}
	
//	public String getName() {
//		return name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	//this : 현재 클래스 자신
//	
//	public void setName(String name) {
//		this.name = name;//같은 이름일 때 지역변수가 우선이다
//	}
//	public void setPhone(String p) {
//		phone = p;
//	}
//	public void setAge(int age/*파라미터*/) {
//		this.age = age;
//	}
	
	
	//----------------------------------------------
	//set,get ctrl + spacebar
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	
	//code 위에서 마우스 우 클릭 후 source - 제너레이트 고르기
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
