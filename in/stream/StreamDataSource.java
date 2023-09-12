package in.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import in.model.DataSource;
import in.model.Person;

public class StreamDataSource {

	public static void main(String[] args) {
		// List<Integer> integers = new ArrayList<>();

		List<Person> users = DataSource.getUsers();

		// System.out.print(users.stream()
		// .collect(Collectors.toMap(
		// person -> person.getName() + "-" + person.getAge(),
		// person -> person)));

		// users.forEach(user -> {
		// System.out.println(users.stream()
		// .filter(u -> u.getName().equals(user.getName()))
		// .collect(Collectors.toList()));
		//
		// });

		// System.out.println("///////////////////////");
		//
		// Map<String, List<Person>> mappedPerson = users.stream()
		// .collect(Collectors.groupingBy(
		// person -> person.getName() + "-" + person.getAge()));

		BiConsumer<ArrayList<Person>, Person> accumulator = (
				ArrayList<Person> a, Person i) -> {

			System.out.println("Stream :" + a.stream()
					.filter(person -> person.getName()
							.equalsIgnoreCase(i.getName()))
					.filter(person -> person.getAge() == i.getAge())
					// .map(person -> {
					// person.setName(
					// person.getName().concat("; " + i.getName()));
					// return person;
					// })
					.map(person -> {

						return person;
					})
					.collect(Collectors
							.groupingBy(person -> person.getName().concat("-")
									.concat(String.valueOf(person.getAge())))));

			System.out.println("ACC : " + i);

			a.add(i);
		};

		BiConsumer<ArrayList<Person>, ArrayList<Person>> combiner = (
				ArrayList<Person> a, ArrayList<Person> i) -> {
			System.out.println("Collector : " + a);
			a.addAll(i);
		};
		//
		System.out.println(
				users.stream().collect(ArrayList::new, accumulator, combiner));

		// users.stream().collect(ArrayList::new, accumulator, combiner);

		Map<String, List<Person>> persons = users.parallelStream()
				.collect(Collectors.groupingBy(person -> person.getName()
						.concat("-").concat(String.valueOf(person.getAge()))));

		BinaryOperator<Person> merge = (person, second) -> {
			person.setAge(person.getAge() + second.getAge());
			person.setName(person.getName().concat(second.getName()));

			System.out.println("person : " + person);
			System.out.println("second : " + second);
			return person;
		};

		Function<Person, Person> setName = (person) -> {
			person.setName(person.getName().concat(" ")
					.concat(String.valueOf(person.getAge()).concat(";"))
					.concat(person.getGender()));
			return person;
		};

		List<Person> unique = new ArrayList<>();
		persons.forEach((key, values) -> {

			Person getPerson = values.parallelStream().map(setName)
					.reduce(merge).get();

			// System.out.println("GET PERSON " + getPerson + "\n");

			unique.add(getPerson);
		});

		System.out.println(unique);
		//
		// System.out.println();
		//
		// System.out.println(unique);
		// System.out.println();
		//
		// System.out.println(persons);

		// System.out
		// .println(
		// users.stream()
		// .collect(Collectors.groupingBy(
		// person -> person.getName().concat("-")
		// .concat(String.valueOf(
		// person.getAge())),
		// Collectors.toList())));

		// System.out.println(users.stream().collect(ArrayList::new,
		// ArrayList::add, ArrayList::addAll));

		// System.out.println(mappedPerson);
		// System.out.println("\\\\\\");
		//
		// List<Person> manupulated = new ArrayList<>();
		// mappedPerson.forEach((key, persons) -> {
		//
		// manupulated.addAll(persons.stream().collect(Collectors.toList()));
		// });
		//
		// System.out.println("?????????????");
		//
		// System.out.println(manupulated);
		// System.out.println(users.stream().collect(Collectors.groupingBy(
		// person -> person.getName() + "-" + person.getAge())));

		// Collectors.mapping(Person::getAge, Collectors.toList())
	}

	private static Person setName(Person person) {
		person.setName(person.getName().concat(" ")
				.concat(String.valueOf(person.getAge()).concat(";"))
				.concat(person.getGender()));
		return person;
	}

	private static Person mergeContent(Person person, Person second) {
		person.setAge(person.getAge() + second.getAge());
		person.setName(person.getName().concat(second.getName()));

		System.out.println("person : " + person);
		System.out.println("second : " + second);
		return person;
	}

}
