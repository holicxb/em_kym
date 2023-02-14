package ex8_work_ans;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GameLoad {

	Rsp rsp;
	
	public Rsp scoreLoader(String id) {
		
		String path = "C:/embedded_kym/RspGame/" + id + ".sav";
		
		File f = new File("C:/embedded_kym/RspGame/");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				
				rsp = (Rsp)ois.readObject();
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
		return rsp;
	}
	
}
