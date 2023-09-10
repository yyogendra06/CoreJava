package in.basic;

public class StringReplaceApp {
	public static void main(String[] args) {
		String origianl = "abcaabc";
		String r = "bc";

		while (origianl.contains(r)) {
			origianl = origianl.replace(r, "");
		}
		System.out.println(origianl);
		System.out.println(removeString(origianl, r));
	}

	static String removeString(String og, String remove) {
		String returnString = "";

		while (og.contains(remove)) {
			og = og.replace(remove, "");
		}

		return og;

	}

	static String removeStringNoLibrary(String og, String remove) {
		String returnString = "";

		while (og.contains(remove)) {
			og = og.replace(remove, "");
		}

		return og;

	}
}
