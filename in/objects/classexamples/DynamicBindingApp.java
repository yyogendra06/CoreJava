package in.objects.classexamples;

/**
 * As This method is overridden, jdk at runtime need to decide which method gets
 * called so it dynamic in nature
 * 
 * @author yogi
 *
 */
public class DynamicBindingApp {
	public static class superclass {
		void print() {
			System.out.println("superclass");
		}

	}

	public static class subclass extends superclass {

		@Override
		void print() {
			System.out.println("subclass");
		}
	}

	public static void main(String[] args) {
		superclass sup = new superclass();
		superclass sub = new subclass();

		sup.print();
		sub.print();

	}
}
