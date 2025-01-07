package ConstructorConcept;

public class EmployeeTest {
	
	String name;
	int id;
	double salary;
	
	

	public EmployeeTest(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	

	public EmployeeTest(int id) {
		this.id = id;
	}


	public EmployeeTest(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		EmployeeTest e1 = new EmployeeTest("Tom");
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.salary);
		
		EmployeeTest e2 = new EmployeeTest("Rakesh", 123, 70000);
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.salary);
		
		EmployeeTest e3 = new EmployeeTest(54543);
		e3.name = "Praveen";
		e3.salary = 9874442;
		System.out.println(e3.name);
		System.out.println(e3.id);
		System.out.println(e3.salary);
		


	}

}
