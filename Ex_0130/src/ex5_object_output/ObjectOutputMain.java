package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(20);
		
		String path = "C:/embedded_kym/person.sav";
		
		//객체를 통째로 출력하는데 사용하는 output Stream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);//Person 객체를 save파일로 저장
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//main
}
