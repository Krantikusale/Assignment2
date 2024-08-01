package assignments2;

import java.util.Scanner;

public class Stud_Info {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Students : ");
		int num = sc.nextInt();

		

		String data[] = new String[num];

		for (int a = 0; a < num; a++) {
			System.out.println("Enter information for student " + (a + 1) + ":");

			System.out.println("Enter name ");
			String name = sc.next();

			System.out.println("Enter email ");
			String email = sc.next();

			System.out.println("Enter Phone ");
			long phone = sc.nextLong();

			System.out.println("Enter Address");
			String address = sc.next();

			System.out.println("Enter status ");
			boolean status = sc.nextBoolean();

			data[a] = "Name : " + name + ", Email : " + email + ", Phone : " + phone + ", Address : " + address
					+ ", Status : " + status;

			System.out.println("Student Info is : " + data[a]);
			System.out.println("*********************");

		}

		System.out.println("Enter student number to view details (1 to " + num + "): ");
		int see = sc.nextInt();
		if (see >= 1 && see <= num) {
			System.out.println(see + " " + data[see - 1]);
		} else {
			System.out.println("Invalid num.");
		}
	}

}