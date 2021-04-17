package in.string;

/**
 * The java string intern() method returns the interned string. It returns the
 * canonical representation of string.
 * 
 * It can be used to return string from memory,if it is created by new
 * keyword.It creates exact copy of heap string object in string constant pool.
 * 
 * @author YoGI
 *
 */
public class InternString {

	public static void main(String[] args) {
		String s1 = "text";
		String s2 = new String("text");
		String s3 = s2.intern();

		System.out.println("s1==s2 : " + (s1 == s2));
		System.out.println("s1==s3 : " + (s1 == s3));
		System.out.println("s2==s3 : " + (s2 == s3));
	}
}
