package ex2_switch;

public class Ex1_switch {

	public static void main(String[] args) {
		
		//switch-case�� : �񱳰��� ���ǰ��� ���� ����� ó���ϴ� ���
		//switch(�񱳰�){
		//	case ���ǰ� : 
		//		�񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		//	break;//case-break�� �ϳ��� ����
		//}
		
		int n = 4;
		switch(n) {//�񱳰�(�� �ϳ��� ��)
		case 1://���ǰ�(���ǰ��� Ÿ���� �񱳰��� �ݵ�� ��ġ�ؾ� �Ѵ�, �ߺ��Ǹ� �� ��)
			System.out.println("1. ���ӽ���");
			break;//switch ���� ������ ���������� Ű����
		case 2:
			System.out.println("2. ���ӼҰ�");
			break;
		case 3:
			System.out.println("3. �ɼ�");
			break;	
		default:
			//�񱳰��� ���ǰ��� ��� ��ġ���� ���� ���
			//�ݵ�� ����Ǵ� ����
			System.out.println("1,2,3�߿� �Է��Ͻÿ�");
			break;
		}//switch
		
	}//main
}