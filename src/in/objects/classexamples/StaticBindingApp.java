package in.objects.classexamples;

/**
 * As in this static is defined at early point class got to know this cannot be
 * overriden then it will bind class with that method
 * 
 * if method is private, final, static it is static binding
 * 
 * @author yogi
 *
 */
public class StaticBindingApp {
	public static class superclass {

		static void print() {
			System.out.println("SuperClass");
		}
	}

	public static class subclass extends superclass {

		static void print() {
			System.out.println("SubClass");
		}
	}

	public static void main(String[] args) {
		superclass sup = new superclass();
		superclass sub = new subclass();

		subclass sub1 = new subclass();

		sup.print();
		sub.print();

		sub1.print();

	}
}
