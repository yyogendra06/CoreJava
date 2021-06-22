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

		// by default it is final
//		a = 20;
		System.out.println(a);
		withoutInterfaceMethodImp.printWithBody();
		Interface1.printWithBodyStatic();

	}

	@Override
	public void print() {
		System.out.println("Implemented Method");
	}

	@Override
	public void printWithBody() {
		System.out.println("Inside ClassWithoutInterfaceMethodImplApp printWithBody()");
	}

}
