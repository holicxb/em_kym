package ex7_thread_work;

public class WorkMain {

	public static void main(String[] args) {
		
		/*
		 1 ~ 100 ������ ���� 2���� ���ϴ� ������ ����
		 Ű���忡�� ���� �Է��Ͽ� �ټ� ������ ����ó�� �� ������ �ڵ尡 �ݺ�
		 ���������� �ټ� ������ ��� �����µ� �� �ʰ� �ɷȴ��� ȭ�鿡 ����ϸ� �ڵ带 ����
		 
		20 + 15 = //���� �Է�
		����!!
		100 + 66 = //���� �Է�
		����...
		61 + 51 = //���� �Է�
		����!!
		...
		53 + 28 = //���� �Է�
		����!!(5��°�� ������ ���� ��Ȳ)
		5������ ó���ϴµ� 24�ʰ� �ɷȽ��ϴ� ���(thread.sleep���)
		*/
		
		//1. ������ 2�� ���� �� + ��� ������ ����
		//2. �ش� ���� ���� ���� �Ͱ� �Է°��� ������ ��
		//3. ������ �� count++
		//4. count�� 5�� �Ǹ� ����
		//�� ���� �� ����ؼ� �ʸ� ������. thread.sleep(1000)���� ���� �� ��?
		
		//���� ���� �޼���
		MakingP mp = new MakingP();
		mp.start();
		mp.problem();
		
	}//main
}