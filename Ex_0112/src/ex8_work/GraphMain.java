package ex8_work;

public class GraphMain {

	public static void main(String[] args) {
		
		//Ŭ������ ���� ���� ���� �д��� ��Ų��
		//0~9������ ������ 100�� ���� �����Ѵ�
		//123456787658765146.........
		//0�� ���� : ###### 6
		//1�� ���� : ######### 9
		// ...
		//9�� ���� : #### 4
		
		GraphMake g = new GraphMake();
		int cnt = 100; //���� 100��
		int ran = 10; //0~9������ ����
		int[] a = new int[cnt];
		a = g.makeRandom(a, cnt, ran); //0~ran-1������ ������ cnt����ŭ ������
		
		//���� ���ڰ� ����� ī��Ʈ �غ���
		//�� ������ # �׸���, # ���� ���
		
		for(int i = 0;	i < ran;	i++) {
			int same = g.countNum(a, i);
			String shap = g.printShap(same);
			g.resultPrint(i, shap, same);
		}
		
		System.out.println("------------------------------");
		
		g.graphM(a);
	}//main
	
}
