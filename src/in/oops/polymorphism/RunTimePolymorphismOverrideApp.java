package in.oops.polymorphism;

import in.oops.polymorphism.model.Employee;
import in.oops.polymorphism.model.Father;
import in.oops.polymorphism.model.Person;

/**
 * This will let us know that how java is working in inheritance
 * 
 * Parent can access Child but in that case better to use instanceof so that it
 * verify that accessing properties is present in that class
 * 
 * @author yogi
 *
 */
public class RunTimePolymorphismOverrideApp {
	public static void main(String[] arguments) {
		Person person = new Person();

		person = new Employee();
		person.displayRole();

		person = new Father();
		person.displayRole();

		Person parent = null;

		/**
		 * Output Will be :
		 * 
		 * Person Employee
		 * 
		 * Because parent is null so unable to identify
		 */
		print(parent);
		print(new Person());
		print(new Employee());

		parent = new Employee();
//		unable to find salary in person so better check Instance Type
//		parent.setSalary(10000);
		if (parent instanceof Employee) {
			((Employee) parent).setSalary(10000);
			System.out.println(((Employee) parent).getSalary());
		}

		parent = new Father();
		// Child Class properties only able to accessed when instanceof is used for type
		// safety purpose
		if (parent instanceof Father) {
			((Father) parent).setNoOfChildren(2);
			System.out.println(((Father) parent).getNoOfChildren());
		}

	}

	/**
	 * This method let us know that java checks the type and respond based on that
	 * so better if working in inheritance to use instanceof
	 * 
	 * @param person
	 */
	static void print(Person person) {
		if (person instanceof Employee) {
			System.out.println("Employee");
		} else if (person instanceof Father) {
			System.out.println("Father");
		} else if (person instanceof Person) {
			System.out.println("Person");
		} else if (person == null) {
			System.out.println("Null Passed as Parameter");
		}
	}
}
