package in.string;

public class NewStringApp {
	public static void main(String[] args) {
		String str1 = new String("String");
		String str2 = new String("String");

		System.out.println("str1 == str2 " + (str1 == str2));

		String str3 = "String";
		String str4 = "string";
		String str5 = "String";

		System.out.println("str3 == str4 " + (str3 == str4));
		System.out.println("str3 == str5 " + (str3 == str5));

		String[] arrString = { "s1" };
		String[] arrString2 = { "s1" };

		System.out.println("arrString == arrString2 " + (arrString == arrString2));
		System.out.println(arrString);
	}
}
