package in.oops.polymorphism;

import in.oops.polymorphism.service.EmployeeServiceImpl;
import in.oops.polymorphism.service.PersonService;
import in.oops.polymorphism.service.SonServiceImpl;

/**
 * This is Runtime Polymorphism on which simple interface can have multiple
 * roles like simple person can be employee and also becomes son or father
 * 
 * this is way of implement with interface and two classes as what role to give
 * 
 * 
 * @author yogendra
 */
public class RunTimePolymorphismInterfaceApp {
	public static void main(String[] args) {

		PersonService person = null;

		person = new EmployeeServiceImpl();
		person.displayRole();

		person = new SonServiceImpl();
		person.displayRole();
	}
}
