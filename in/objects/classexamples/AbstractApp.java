package in.objects.classexamples;

abstract class AbstractClass {
	public void nonAbstractDisplay() {
		System.out.println("Inside nonAbstractDisplay()");
	}

	public abstract void abstractDisplay();
}

/**
 * Implementation of Abstract Class so that we can use it
 * 
 * @author yogi
 */
class AbstractClassImpl extends AbstractClass {

	@Override
	public void abstractDisplay() {
		System.out.println("Inside abstractDisplay()");
	}

}

public class AbstractApp {

	public static void main(String[] args) {

//		Cannot instate this because it is abstract class
//		AbstractClass abstractClass = new AbstractClass();

		AbstractClass abstractApp = new AbstractClassImpl();
		abstractApp.nonAbstractDisplay();
		abstractApp.abstractDisplay();
	}

}
