package in.basic;

class ParentInitClass extends InitClass{
	{
		System.out.println("Within Parent Init class iib 1");
	}
	
	public ParentInitClass() {
		System.out.println("Inside pi class ctor");
	}
}

class InitClass {
	
	// multiple instance initialisation block is executed on given order
	{
		System.out.println("Within instance initialisation Block 2");
	}
	{
		System.out.println("Within instance initialisation Block 1");
	}

	public InitClass() {
		System.out.println("INSIDE NON ARG Constructor");
	}

}

class StaticClass{
	static {
		System.out.println("INSIDE static Block 1");
	}
	
	static {
		System.out.println("INSIDE static Block 3");
	}
	
	static {
		System.out.println("INSIDE static Block 2");
	}
	
	public StaticClass() {
		System.out.println("INSIDE NON ARG Constructor");
	}
}

public class InitStaticBlockApp {
	public static void main(String[] args) {
		InitClass initClass1 = new InitClass();
		
		ParentInitClass parentInitClass1 = new ParentInitClass();

		StaticClass staticClass1 = new StaticClass();
		
	}
}
