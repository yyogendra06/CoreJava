package in.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestListApp {
	public static class Employee {
		int empId;
		String empName;
		double salary;

		public Employee(int empId, String empName, double salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}

		public Employee() {
			super();
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]\n";
		}

	}

	public static void main(String[] args) {
		List<Employee> lists = new ArrayList<Employee>(Arrays.asList(new Employee(10, "John", 15000),
				new Employee(11, "Kattey", 16000), new Employee(12, "Bruce", 10000)));

		// By Using Comparator we can create custom comparter by fields.
		Comparator<Employee> compareByEmpName = (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName());
		Comparator<Employee> compareByEmpId = (e1, e2) -> {
			if (e1.getEmpId() > e2.getEmpId())
				return 1;
			if (e1.getEmpId() < e2.getEmpId())
				return -1;
			else
				return 0;
		};
		Comparator<Employee> compareByEmpSalary = (e1, e2) -> {
			if (e1.getSalary() > e2.getSalary())
				return 1;
			if (e1.getSalary() < e2.getSalary())
				return -1;
			else
				return 0;
		};

		System.out.println("Normal List");
		System.out.println(lists);

		System.out.println("Compare by Name");
		lists.sort(compareByEmpName);
		System.out.println(lists);

		System.out.println("Compare by ID");
		lists.sort(compareByEmpId);
		System.out.println(lists);

		System.out.println("Compare by Salary");
		lists.sort(compareByEmpSalary);
		System.out.println(lists);
	}
}
