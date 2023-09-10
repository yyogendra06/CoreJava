package in.objects.interfaceexamples;

/**
 * 
 * This Class not implements the print() method of interface do to that it
 * needed to declare as abstract so that there subclass can define this method
 * 
 * @author yogi
 *
 */
abstract class ClassWithoutInterfaceMethodImp implements Interface1, Interface2 {

}

/**
 * This class compulsory needed to implement print()
 * 
 * @author yogi
 *
 */
public class ClassWithoutInterfaceMethodImplApp extends ClassWithoutInterfaceMethodImp {

	public static void main(String[] args) {
		ClassWithoutInterfaceMethodImp withoutInterfaceMethodImp = new ClassWithoutInterfaceMethodImplApp();
		withoutInterfaceMethodImp.print();

		// by default it is final and static
		System.out.println(Interface1.defaultVariable);
		System.out.println(Interface1.finalVariable);
		System.out.println(Interface1.staticVariable);

		// method with default can be overridden
		withoutInterfaceMethodImp.defaultMethodInterface();

		// unable to Override the static methods
		Interface1.staticMethodInterface();

	}

	@Override
	public void print() {
		System.out.println("Implemented Method");
	}

	@Override
	public void defaultMethodInterface() {
		System.out.println("Inside ClassWithoutInterfaceMethodImplApp defaultMethodInterface()");
	}

}
