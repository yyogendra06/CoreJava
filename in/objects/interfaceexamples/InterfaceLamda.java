package in.objects.interfaceexamples;

public interface InterfaceLamda {

	void print();

	default void print(int i) {
		System.out.println("Heello there " + i);
	}
}
