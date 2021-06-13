package in.classexamples;

abstract class AbstractClass {
	public void nonAbstractDisplay() {
		System.out.println("Inside nonAbstractDisplay");
	}
}

/**
 * Implementation of Abstract Class so that we can use it
 * 
 * @author yogi
 */
class AbstractClassImpl extends AbstractClass {

}

public class AbstractApp {

	public static void main(String[] args) {

//		Cannot instate this because it is abstract class
//		AbstractClass abstractClass = new AbstractClass();

		AbstractClass abstractApp = new AbstractClassImpl();
		abstractApp.nonAbstractDisplay();
	}

}
