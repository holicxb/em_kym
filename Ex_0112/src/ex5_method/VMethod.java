package ex5_method;

public class VMethod {

	//(int ... n) <- variable arguments
	//�Ķ���� ������ ������ ���� �ʴ� Ÿ��
	public void v_test(int...n) {
		//n[] = {1,10,3,8}
		for(int i = 0;	i < n.length;	i++) {
			System.out.println(n[i]);
		}//for
	}
	
}
