package in.basic;

public class PalindromeApp {
	public static void main(String[] args) {
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome("dad"));
		System.out.println(isPalindrome("daad"));
		System.out.println(isPalindrome("daadi"));
		System.out.println(isPalindrome(String.valueOf(1221)));
		System.out.println(isPalindrome(String.valueOf(122122)));

		System.out.println(isPalindrome(1010101));
	}

	public static boolean isPalindrome(String str) {

		int size = str.length();

		for (int i = 0; i < size; i++)
			if (str.charAt(i) != str.charAt(size - i - 1) && i < size)
				return false;

		return true;
	}

	public static boolean isPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			return true;
		}
		return false;
	}

}
