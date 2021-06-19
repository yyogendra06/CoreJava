package in.basic;

public class StringTest {

	public static void main(String[] args) {
		String original = "abcaabc";
		String r = "bc";

		while(original.contains(r))
		{
			original.replace(r, "");
		}
		System.out.println(original);
	}
}
