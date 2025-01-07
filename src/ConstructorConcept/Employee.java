package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	long ph;
	
//	public Employee() {
//		System.out.println("Default constructor");
//	}
	
	public Employee(int a) {
		System.out.println("! param constructor");
	}
	
	public Employee(int a, String b) {
		System.out.println("2 parma constructor");
	}
	
	
	public static void main(String args[]) {
		Employee emp = new Employee(10);
		emp.name = "Noor";
		
		
	}



}
