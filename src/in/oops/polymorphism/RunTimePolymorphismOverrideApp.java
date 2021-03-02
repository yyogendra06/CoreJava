package in.oops.polymorphism;

import in.oops.polymorphism.model.Employee;
import in.oops.polymorphism.model.Father;
import in.oops.polymorphism.model.Person;

public class RunTimePolymorphismOverrideApp {
	public static void main(String[] arguments) {
		Person person = new Person();

		person = new Employee();
		person.displayRole();

		person = new Father();
		person.displayRole();
	}
}
