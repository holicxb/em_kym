package ex9_break_continue;

public class Ex3_continue {

	public static void main(String[] args) {
		
		//continue�� : �ݺ��� ������ Ư�� ������ �����ϰ� �ǳ� �ٰ��� �� �� ���Ǵ� Ű����
		for(int i = 1;	i <= 2;	i++) {
			for(int j = 1;	j <= 5;	j++) {
				if(j % 2 == 0) {
					//for�� ������ continue�� ������ ���� ����� for���� ���������� �ǳ� �ڴ�. 
					continue;
					//break�� ���������� �ٷ� �Ʒ����� � �ڵ嵵 �߰��� �� ���� 
					//���� for������ �ǵ������� �������� �����ߴٸ� �ش� for���� ���ǽ����� �ö�
				}
				System.out.printf("%d ",j);
				//2�� ��� ��� �ȵ� , Ż���� �Ұ�, ���������� �ö�
				
			}//inner
			System.out.println();
		}//outer
		
	}//main
}
