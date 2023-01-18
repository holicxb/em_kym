package ex5_interface;


public class Kitchen implements AllMenu {
//public class Kitchen implements Menu1, Menu2, Menu3{
	//인터페이스는 구현 능력이 없기 때문에
	//하나의 클래스에서 다중으로 상속(구현)이 가능하다
	@Override
	public String jjajang() {
		return "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		return "고추기름 + 각종 해물";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근 + 양파 ...";
	}

	@Override
	public String boggembab() {
		return "밥 + 달걀 등등...";
	}

	@Override
	public String mando() {
		return "밀가루 + 고기 다진거";
	}

	@Override
	public String rajogi() {
		return "닭고기";
	}
	
}