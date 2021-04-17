package in.string;

public class Trail1App {
	public static void main(String[] args) {

		String string1 = "sachin";
		String string2 = " sachin";
		String string3 = "sachin";
		String string4 = new String("sachin");

		System.out.println("string1==string2 : " + (string1 == string2));
		System.out.println("string1==string3 : " + (string1 == string3));
		System.out.println("string1==string4 : " + (string1 == string4));

		System.out.println(
				"string1.equals(string2) : " + string1.equals(string2));
		System.out.println(
				"string1.equals(string3) : " + string1.equals(string3));

	}
}
