package ex5_work;
import java.util.*;
public class VendingMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//자판기
		//내가 입력한 금액으로 살 수 있는 음료 목록만 출력
		//음료를 선택하면 제공 및 잔액 반환
		
		//insert coin : 1000
		//fanta - 1000
		//coke - 900
		//sider - 900
		//>> coke
		//coke (을)를 선택하셨습니다
		//잔액 : 100원
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Vending[] v = new Vending[4];
		//음료 목록
		
		for(int i = 0;	i < v.length;	i++) {
			v[i] = new Vending();
		}
		
		v[0].setCan("fanta");
		v[0].setWon(1000);
		v[1].setCan("coke");
		v[1].setWon(900);
		v[2].setCan("sider");
		v[2].setWon(900);
		v[3].setCan("water");
		v[3].setWon(1500);
		
		//동전 넣기
		System.out.print("insert coin : ");
		int coin = scan.nextInt();
		
		//금액보다 낮은 음료 판단하여 출력하기
		for(int i = 0;	i < v.length;	i++) {
			if(coin >= v[i].getWon()) {
				System.out.println(v[i].getCan() + " - " + v[i].getWon());
//				v[count++].setCan(v[i].getCan());
//				v[count++].setWon(v[i].getWon());
			}
		}
		
		//목록 중에 음료 선택하기
		System.out.print(">> ");
		String myPick = scan.next();
		
		//선택한 음료가 있는지 없는지 판단하여 선택하였음을 출력
		for(int i = 0;	i < v.length;	i++) {
			
			
		}
		
		
		//잔액 출력
		
		
		
		
		
	}//main
	
}
