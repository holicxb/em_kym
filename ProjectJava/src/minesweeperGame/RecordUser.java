package minesweeperGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class RecordUser{

	public ArrayList<User> loadFile(String path) {
		ArrayList<User> usr = new ArrayList<User>();
		File f = new File(path);
		String[] str = f.list();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		for (int i = 0; i < str.length; i++) {
			if (f.exists()) {
				try {
					fis = new FileInputStream(path + str[i]);
					ois = new ObjectInputStream(fis);

					usr.add((User)ois.readObject());

//					System.out.println(usr.get(i).getName());
//					System.out.println(usr.get(i).getTimer());
//					System.out.println(usr);
//					System.out.println("----------------");
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				} finally {
					try {
						ois.close();
						fis.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		Collections.sort(usr, new SortTime());
		
//		for(int i = 0;	i < usr.size();	i++) {
//			System.out.println(usr.get(i).getName() + " : " + usr.get(i).getTimer());
//		}
//		System.out.println("==================");
		
		return usr;
		
	}

	

	public void writeFile(String path, String name, User userList) throws IOException {

		File f = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			if (!f.exists()) {
				f.mkdirs();
			}

			fos = new FileOutputStream(path + name + ".sav");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(userList);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
