package ex2_abstract;

public abstract class AbsEx {

	//�߻�Ŭ����
	//�߻� �޼��带 �� �� �̻� ������ �ִ� Ŭ����
	//abstract Ű���带 ���� �߻� Ŭ�������� �������� �Ѵ�
	//�ݵ�� �ڽ��� �ʿ�
	
	int value = 100;
	int num = 20;
	
	public int getNum() {
		return num;
	}
	
	//�߻� �޼���
	//�޼����� ��ü(body)�� ����
	//abstract Ű���带 ���� �ݵ�� �߻� �޼������� �������� �Ѵ�
	
	//�߻� �޼���� ��ü�� ���� ������ '�̿ϼ��� ����'�̶�� �Ѵ�
	//�̿ϼ��� �޼��带 �ڽ�Ŭ������ �����޾Ƽ� �ϼ���Ű�� ���� ������ �ȴ�
	abstract public void setValue(int n);
	
} 
