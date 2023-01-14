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
		
		Scanner scan = new Scanner(System.in);
		Vending[] v = new Vending[4];
		Vending[] canDrink = new Vending[4];
		//배열 사이즈를 나중에 정할 수는 없나?
		//미리 4로 정하는 경우 null 오류가 발생함
		int count = 0;
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
			canDrink[i] = new Vending();
			canDrink[i].setCan("");
			canDrink[i].setWon(0);
			if(coin >= v[i].getWon()) {
				canDrink[count].setCan(v[i].getCan());
				canDrink[count].setWon(v[i].getWon());
				System.out.println(canDrink[count].getCan() + " - " + canDrink[count].getWon());
				count++;
			}
		}
		
		//목록 중에 음료 선택하기
		System.out.print(">> ");
		String myPick = scan.next();
		boolean exist = false;
		//선택한 음료가 있는지 없는지 판단하여 선택하였음을 출력
		for(int i = 0;	i < canDrink.length;	i++) {
			if(myPick.equalsIgnoreCase(canDrink[i].getCan())) {
				System.out.println(canDrink[i].getCan() + " 을(를) 선택하셨습니다");
				System.out.println("잔액 : " + (coin - canDrink[i].getWon()));
				exist = true;
			}
		}
		if(exist == false) {
			System.out.println("해당음료는 구매 불가");
		}
	}//main
	
}
