package in.basic;

/**
 * From below Code explains that static block has higher priority than instance
 * instance initialisation block and execute when first object is created
 * 
 * and iis block has highest priority than constructor call
 * 
 * @author yogi
 *
 */
class InitClass {

	// This will execute before constructor call
	{
		System.out.println("InitClass IIS Block 1");
	}

	// Static block executes before IIS block and once only for that class
	static {
		print();
		System.out.println("InitClass Static Block 1");
	}

	public InitClass() {
		System.out.println("InitClass NON ARG Constructor");
	}

	static void print() {
		System.out.println("PRint Method static");
	}

}

class ParentInitClass extends InitClass {
	{
		System.out.println("ParentInitClass class IIB 1");
	}

	public ParentInitClass() {
		System.out.println("ParentInitClass pi class ctor");
	}
}

public class InitStaticBlockApp {
	public static void main(String[] args) {
		InitClass initClass1 = new InitClass();

		System.out.println();

		ParentInitClass parentInitClass1 = new ParentInitClass();

	}
}
