package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 이름 : aaa
		// 나이 : 20
		// aaa / 20
		// ----------
		// 이름 : bbb
		// 나이 : 30
		// aaa / 20
		// bbb / 30
		// ----------
		// 이름 : aaa
		// 이름이 중복됩니다
		// ----------
		// 이름 : ...

		Scanner sc = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();

		out: while (true) {
			User u = new User();/* 중요 */

			System.out.print("이름 : ");
			String name = sc.next();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(name)) {
					System.out.println("이름이 중복됩니다");
					System.out.println("-----------------");
					continue out;
				}
			}

			System.out.print("나이 : ");
			int age = sc.nextInt();

			u.setName(name);
			u.setAge(age);

			list.add(u);

			// 결과출력
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s / %d\n", list.get(i).getName(), list.get(i).getAge());
			}
			System.out.println("-----------------");
		}

	}// main

}
