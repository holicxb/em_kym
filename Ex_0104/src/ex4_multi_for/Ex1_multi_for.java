package ex4_multi_for;

public class Ex1_multi_for {

	public static void main(String[] args) {
		
//		다중 for문 : for문 안에 for문이 추가되어 있는 경우
//		1	2	3	4	5
//		1	2	3	4	5
//		1	2	3	4	5
		for(int i = 1;	i <= 3;	i++) {//행(y)
			
			for(int j = 1;	j <= 5;	j++) {//열(x)
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("-----------------------");
		
		//1 2 3 
		//4 5 6
		//7 8 9
		int num = 0;
		for(int i = 0;	i < 3;	i++) {
			for(int j = 0;	j < 3;	j++) {
				
//				num++;
//				System.out.print(num + " ");
				System.out.print(++num + " "); 
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		//A B C
		//D E F
		//G H I
		
		char ch = 'A';
//		char ch = 65;
		for(int i = 0;	i < 3;	i++) {
			for(int j = 0;	j < 3;	j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}//main
}
