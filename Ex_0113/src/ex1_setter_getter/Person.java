package ex1_setter_getter;

public class Person {

	//setter & getter : private���� ������� �Ӽ��鿡 ������ �� �ֵ��� �ϱ� ���� ����
	
	private String brand = "samsung";
	private String name;
	private String phone;
	private int age;
	
	//������ ������ϸ� getter�� �����
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
//	//this : ���� Ŭ���� �ڽ�
//	
//	public void setName(String name) {
//		this.name = name;//���� �̸��� �� ���������� �켱�̴�
//	}
//	public void setPhone(String p) {
//		phone = p;
//	}
//	public void setAge(int age/*�Ķ����*/) {
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
	
	//code ������ ���콺 �� Ŭ�� �� source - ���ʷ���Ʈ ����
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
