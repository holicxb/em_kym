package ex3_io_file;

import java.io.File;

public class Ex3_File {

	public static void main(String[] args) {
		
		String path = "C:/embedded_kym/aaa";
		
		File f = new File(path);
		
		//���� Ŭ���� f�� ��ΰ� ���������� �����ϴ����� Ȯ���ϴ� �޼���
		if(f.exists()) {
			System.out.println("�������� �� ���̾��");
		}else {
			System.out.println("�������� �ʴ� ��ΰ� �ֽ��ϴ�");
			//f.mkdir();//�� ���� �ϳ��� ������ ����
			f.mkdirs();//2�� �̻��� ���� ����
		}
		
	}//main
}
