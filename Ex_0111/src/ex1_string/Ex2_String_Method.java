package ex1_string;

public class Ex2_String_Method {

	public static void main(String[] args) {
		
		//String Ŭ������ �޼���(���)��
		//�޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����
		//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ����
		
		String name = "Hong Gil Dong";
		int len = name.length();//�޼���� ()�� ����
		System.out.println("������ ���� : " + len);//���� ������ ��� ������ ��
		
		int index = name.indexOf('o');//�տ� �ִ� '����'�� ��ġ�� ã�Ƴ�
		System.out.println("�� ù��° o�� ��ġ : " + index);
		
		index = name.lastIndexOf('o');//�� ���� '����'�� ��ġ�� ã�Ƴ�
		System.out.println("�� ���� o�� ��ġ : " + index);
		
		char c = name.charAt(5); //�ش� �ε����� ���ڸ� ����
		System.out.println("������ ���� : " + c);
		
		String s1 = name.substring(5);//�߶�. n�� ���� ��� ������ �߶�
		System.out.println("5��° ��ġ������ ��� ������ �߶󳻽ÿ� : " + s1);
		
		s1 = name.substring(5, 10);//n1~n2-1��°�� ������ �߶�
		System.out.println("5��°���� 9��°������ ������ �߶󳻽ÿ� : " + s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');
		System.out.println(".�� /�� ġȯ" + s1);
		
		name = name.replace("on", "ii");
		System.out.println("on�� ii�� ġȯ : " + name);
		
		name = name.replaceAll("ii", "on");
		System.out.println("ii�� on���� ġȯ : " + name);
		
		name = "Kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		name = name.replace('.', '/');
		System.out.println("replace : " + name);
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll : " + name2);
		//.�� ������ �� �չ����� �� �������� ����
		
		String id = " hi hello ";//�ǹ̰� ���� ������ ���� �� �ִ�
		System.out.println(id);
		id = id.trim();//���� �� ���� �ǹ� ���� ������ ����
		System.out.println("trim�� ����� �� ���� : " + id.length());
		System.out.println(id);
		
		String[] id2 = id.split(" ");//Ư�� ������ �������� �迭 ���·� ������ �������ִ� �޼���
		System.out.println(id2[0] + " / " + id2[1]);
		
		String answer = "Apple";
		if(answer.equals("apple")) {//��ҹ��ڰ� �ٸ��� ���� �ٸ��ٰ� �Ǵ�
			System.out.println("���� ����");
		}
		if(answer.equalsIgnoreCase("apple")) {
			System.out.println("���� ����");
		}
		
		//��Ʈ�� Ŭ������ �޼���� �ƴ����� ������ ���� ����ϰ� �� �޼���
		String num = "10";
//		num += 1; //11�� ���� ���� 101ó�� ����
		
		//���� ������ ���ڿ�(String)�� ������ ������ ���� ������ �ٲ㺸��!
		int a = Integer.parseInt(num);
		System.out.println(a + 1);
		
	}//main
	
}
