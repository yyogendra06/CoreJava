package in.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Predicate {
	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Alixe", Gender.FEMALE), new Person("Alice", Gender.FEMALE),
				new Person("Alexander", Gender.MALE), new Person("Bob", Gender.MALE),
				new Person("Micheal", Gender.MALE));

		Predicate<Person> onlyFemale = person -> person.gender.equals(Gender.FEMALE);
		Predicate<Person> onlyMale = person -> person.gender.equals(Gender.MALE);
		Predicate<Person> onlyNameStartsWithA = person -> person.name.startsWith("A");
		
		Predicate<Person> onlyNameStartsWithAAndFemale = onlyNameStartsWithA.and(onlyFemale);

		System.out.println("// ONLY FEMALES");
		list.stream().filter(onlyFemale).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("// ONLY MALES");
		list.stream().filter(onlyMale).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("// ONLY STARTS WITH A");
		list.stream().filter(onlyNameStartsWithA).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("// ONLY STARTS WITH A And Female");
		list.stream().filter(onlyNameStartsWithAAndFemale).collect(Collectors.toList()).forEach(System.out::println);

	}

	static class Person {
		String name;
		Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	static enum Gender {
		MALE, FEMALE
	}
}
