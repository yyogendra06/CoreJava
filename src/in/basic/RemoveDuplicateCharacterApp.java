package in.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterApp {
	public static void main(String[] args) {
		System.out.println(removeDuplicateCharacter("geeksforgeeks"));
		System.out.println(removeDuplicateUsingSet("geeksforgeeks"));
	}

	static String removeDuplicateCharacter(String s) {

		int index = 0;
		char[] originalString = s.toCharArray();
		char[] newString = new char[s.length()];

		for (int i = 0; i < originalString.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (originalString[i] == originalString[j])
					break;
			}

			if (i == j) {
				newString[index++] = originalString[j];
			}
		}

		return String.valueOf(Arrays.copyOf(newString, index));
	}

	static String removeDuplicateUsingSet(String s) {

		Set<Character> characters = new HashSet<Character>(s.length() - 1);

		for (char c : s.toCharArray())
			characters.add(c);

		Character[] array = characters.toArray(new Character[0]);
		System.out.println(Arrays.toString(array));

		System.out.println(characters.stream().map(arr -> String.valueOf(arr)).collect(Collectors.joining()));

		return "";
	}
}
