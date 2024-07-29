package assignments2;

public class Trainer {
	String name;
	String department;
	String email;
	int id;

	public Trainer(String ename, String dept, String email_id, int e_id) {

		System.out.println("Trainer Details are : " + ename + "," + dept + "," + email_id + "," + e_id);
		name = ename;
		department = dept;
		email = email_id;
		id = e_id;

	}

	public static void main(String[] args) {
		Trainer t = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer t1 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer t2 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		System.out.println("----------------------------------------");

		t.selenium();
		t1.devOps();
		t2.webDevelopement();

	}

	public void selenium() {
		System.out.println(name + "  can teach Selenium");
	}

	public void devOps() {
		System.out.println(name + "  can teach devOps");
	}

	public void webDevelopement() {
		System.out.println(name + "  can teach web Developement");
		
	}

}
