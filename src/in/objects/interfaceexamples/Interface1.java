package in.objects.interfaceexamples;

public interface Interface1 {

	int a = 10;

	void print();

	default void printWithBody() {
		System.out.println("default printWithBody");
	}

	static void printWithBodyStatic() {
		System.out.println("static printWithBodyStatic");
	}
}
