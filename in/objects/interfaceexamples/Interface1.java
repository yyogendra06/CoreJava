package in.objects.interfaceexamples;

public interface Interface1 {

	int defaultVariable = 10;
	final int finalVariable = 20;
	static int staticVariable = 30;

	void print();

	default void defaultMethodInterface() {
		System.out.println("defaultMethodInterface()");
	}

	static void staticMethodInterface() {
		System.out.println("staticMethodInterface()");
	}
}
