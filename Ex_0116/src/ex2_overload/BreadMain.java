package ex2_overload;

public class BreadMain {

	public static void main(String[] args) {
		
		Bread bread = new Bread();
		
		//makeBread() 1번 호출 시
		//빵을 만들었습니다 출력
		bread.makeBread();
		System.out.println("------------");
		//makeBread() 2번 호출 시
		//메서드를 한번만 불러도 내가 원하는 개수만큼 빵을 만듦
		//빵을 만들었습니다 
		//빵을 만들었습니다 
		//빵을 만들었습니다 
		
		bread.makeBread(3);
		System.out.println("------------");
		
		//makeBread() 3번 호출 시
		//원하는 빵을 몇 개 만들건지 알려줘야 함
		//크림빵을 만들었습니다
		//크림빵을 만들었습니다
		//2개의 크림빵을 만들었어요
		bread.makeBread("단팥빵", 2);
		System.out.println("-------------");
		
		
	}//main
	
}
