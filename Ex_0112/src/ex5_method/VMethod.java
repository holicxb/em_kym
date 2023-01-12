package ex5_method;

public class VMethod {

	//(int ... n) <- variable arguments
	//파라미터 개수에 제한을 두지 않는 타입
	public void v_test(int...n) {
		//n[] = {1,10,3,8}
		for(int i = 0;	i < n.length;	i++) {
			System.out.println(n[i]);
		}//for
	}
	
}
