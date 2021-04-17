package in.staticexamples;

class Parent {
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
		System.out.println("static Sub class");
	}
	
	public static void main(String[] args) {
		Parent obj = new StaticPrivateOverrideApp();
		Parent.displaystatic();
		StaticPrivateOverrideApp.displaystatic();
//		obj.display();
	}
}