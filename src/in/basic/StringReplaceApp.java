package in.basic;

public class StringReplaceApp {
	public static void main(String[] args) {
		String origianl = "abcaabc";
		String r = "bc";

		while (origianl.contains(r)) {
			origianl.replace(r, "");
		}
		System.out.println(origianl);
	}
}
