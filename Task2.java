package assignments2;

public class Task2 {
	String name;
	String department;
	String email;
	int id;

	public Task2(String ename, String dept, String email_id, int e_id) {

		System.out.println("Trainer Details are : " + ename + "," + dept + "," + email_id + "," + e_id);
		name = ename;
		department = dept;
		email = email_id;
		id = e_id;

	}

	public static void main(String[] args) {
		Task2 t = new Task2("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Task2 t1 = new Task2("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Task2 t2 = new Task2("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		System.out.println("----------------------------------------");

		t.selenium();
		t1.devOps();
		t2.webDevelopement();
		
		
		
		Object Trainer[] = { "Mukesh", "Testing", "mukesh@gmail.com", 1,"Hitesh", "Dev", "mukesh@gmail.com", 2,"Mukesh", "DevOps", "mukesh@gmail.com", 3 };
		for (Object obj : Trainer) {
			System.out.println(obj);
			
		}
	}

	public void selenium() {
		System.out.println(name + "  can teach Selenium");
	}

	public void devOps() {
		System.out.println(name + "  can teach devOps");
	}

	public void webDevelopement() {
		System.out.println(name + "  can teach web Developement");
		System.out.println("----------------------------------------");
	}
	
}

