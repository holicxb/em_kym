package ex1_class;

public class Computer {

	//Ŭ������ �������
	//1) ����, �Ӽ�, ���...
	//2) �޼���, �Լ�, ���
	
	//��ǻ�͸� ����� ���� �۾�
	private String brand = "apple";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	//��ǻ���� ������ Ȯ���ϱ� ���� �޼���(���)
	//�޼��� : �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ����� ����
	
	public void getInfo() {
		System.out.println("������ : " + brand);
		System.out.println("�뷮 : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);		
		System.out.println("���� : " + color);
		System.out.println("-----------------");
	}
	
	//�޼����� ����
	//����������	��ȯ��	�޼����(�Ķ����, ����, �Ű�����...)/ù���� �ҹ���
	//public	void	getInfo()	{�޼��� ȣ�� �� ���� ����}
	
	//���� ������ :
	//1) public : ���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
	//2) private : ���� Ŭ���������� ����� �㰡
	//3) protected : ��� ������ ��ü�鿡�Ը� ����� �㰡
	//4) default : ���� ��Ű�� ���� ��ü�鿡�� ����� �㰡 (�ƹ��͵� ���õǾ����� ������ ���� ��)
	
}