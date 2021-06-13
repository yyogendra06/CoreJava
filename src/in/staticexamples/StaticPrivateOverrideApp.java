package in.staticexamples;

/**
 * For Showing the private method cannot be overridden
 * 
 * and static method also unable to overridden
 * 
 * @author yogi
 *
 */
class Parent {
	/**
	 * Private method cannot be overridden by child class
	 */
	private void display() {
		System.out.println("Super class");
	}

	static void displaystatic() {
		System.out.println("static Super class");
	}
}

public class StaticPrivateOverrideApp extends Parent {
	void display() {
		System.out.println("Sub class");
	}

	static void displaystatic() {
//		super();
		System.out.println("static Sub class");
	}

	public static void main(String[] args) {

		Parent.displaystatic();
		StaticPrivateOverrideApp.displaystatic();

//		Parent obj = new StaticPrivateOverrideApp();
//		obj.display();
	}
}