package ex8_work;

public class GraphMain {

	public static void main(String[] args) {
		
		//클래스를 직접 만들어서 역할 분담을 시킨다
		//0~9사이의 난수를 100개 만들어서 저장한다
		//123456787658765146.........
		//0의 갯수 : ###### 6
		//1의 갯수 : ######### 9
		// ...
		//9의 갯수 : #### 4
		
		GraphMake g = new GraphMake();
		int cnt = 100; //난수 100개
		int ran = 10; //0~9사이의 난수
		int[] a = new int[cnt];
		a = g.makeRandom(a, cnt, ran); //0~ran-1사이의 난수를 cnt개만큼 만들어라
		
		//같은 숫자가 몇개인지 카운트 해보기
		//몇 개인지 # 그리기, # 개수 출력
		
		for(int i = 0;	i < ran;	i++) {
			int same = g.countNum(a, i);
			String shap = g.printShap(same);
			g.resultPrint(i, shap, same);
		}
		
		System.out.println("------------------------------");
		
		g.graphM(a);
	}//main
	
}
