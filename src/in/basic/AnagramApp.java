package src.in.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramApp {

	public static boolean isAnagram(String s1, String s2) {

		char[] firstWord = s1.toCharArray();
		int fLength = firstWord.length;

		char[] secondWord = s2.toCharArray();
		int sLength = firstWord.length;

		if (fLength != sLength)
			return false;

		Arrays.sort(firstWord);
		Arrays.sort(secondWord);

		for (int i = 0; i < fLength; i++)
			if (firstWord[i] != secondWord[i])
				return false;

		return true;
	}

	public static void groupingBasedOnAnagarm(List<String> list) {

		Set<String> set = list.stream().collect(Collectors.toSet());

		Function<String, String> anagram = (e) -> e.toString();

		System.out.println(list.stream().collect(
				Collectors.groupingBy(anagram, Collectors.mapping(e -> e.toString(), Collectors.joining(",")))));

		System.out.println(set);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("dog", "cat", "god", "cat"));

		System.out.println(isAnagram("dog", "god"));
		groupingBasedOnAnagarm(list);
	}
}
