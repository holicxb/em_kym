package ex5_super;

public class Child extends Parent{

	public Child() {
		//super : �θ�Ŭ����
		super(10);//�θ��� ������ - ���� ���� ��ġ���� ������ ������ ����
		
		super.name = "ȫ�浿";//�θ�Ŭ������ ������ ����
		System.out.println("child�� ������ " + name);
	}
	
	@Override
	public void getMsg() {
		//Parent�� getMsg()�޼��带 ������ ���ÿ�
		//super.getMsg();
		
		System.out.println("���� �ڽ�");
	}
}
