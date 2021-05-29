package in.staticexamples;

class Test {
	private static int privateCount;
	public static int publicCount;

	public static int getCount() {
		return privateCount;
	}

	public static void setCount(int count) {
		Test.privateCount = count;
	}

}

public class PrivateStaticVariableApp {

	public static void main(String[] args) {
		Test.setCount(1);
		Test.publicCount++;
		Test.setCount(2);
		Test.publicCount++;

		System.out.println("PRivate Count : " + Test.getCount());
		System.out.println("Public Count : " + Test.publicCount);
	}
}