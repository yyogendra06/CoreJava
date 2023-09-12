package in.model;

public class Employee extends Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void displayRole() {
		System.out.println("Role as Employee");
	}
}
