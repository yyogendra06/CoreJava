package in.objects.interfaceexamples;

public class InterfaceLambdaApp {
	public static void main(String[] args) {
		InterfaceLamda interfaceLamda = () -> System.out.println("Hey There");
		interfaceLamda.print();
		interfaceLamda.print(10);
	}
}
