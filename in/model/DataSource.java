package in.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

	public static List<Person> getUsers() {
		List<Person> users = new ArrayList<>();

		users.add(new Person("Yogesh Yadav", Gender.MALE, 28));
		users.add(new Person("Babita Yadav", Gender.FEMALE, 23));
		users.add(new Person("Babita Yadav", Gender.MALE, 23));
		users.add(new Person("Vijay Yadav", Gender.MALE, 23));
		users.add(new Person("Santosh", Gender.FEMALE, 28));
		users.add(new Person("Santosh", Gender.MALE, 28));

		return users;
	}

	public static List<Questions> getQuestions() {
		List<Questions> questions = new ArrayList<>();

		questions.add(
				new Questions("p3_q1_s2", "Performance and Delivery Focus"));
		questions.add(new Questions("p3_q1_s2_c1",
				"Persistent in actions to achieve the targets (Readiness to repeat attempts)"));
		questions.add(new Questions("p3_q1_s2_c2",
				"Accomplishment of exceptional work/unforeseen tasks performed"));
		questions.add(new Questions("p3_q1_s2_c3",
				"Ability to remain focused on goals despite diversions."));
		questions.add(
				new Questions("p3_q1_s2_c4", "Reliability and dependability."));

		questions.add(new Questions("p4_q1_s1", "Service Orientation"));
		questions.add(new Questions("p4_q1_s1_c1",
				"Understands who are the internal and external customers for own services."));
		questions.add(new Questions("p4_q1_s1_c2",
				"Promptness in responding to the employees�/other departments� requests and concerns."));
		questions.add(new Questions("p4_q1_s1_c3",
				"Maintenance of coordinal relations with employees and other departments."));
		questions.add(
				new Questions("p3_q1_s1", "Time Management and efficiency"));
		questions.add(new Questions("p3_q1_s1_c1",
				"Ability to differentiate between personal and organizational priorities"));
		questions.add(new Questions("p3_q1_s1_c2",
				"Ability to organize his / her work and meet the deadlines."));
		questions.add(new Questions("p3_q1_s1_c3",
				"Ability to eliminate time wasters from the work."));
		questions.add(new Questions("p3_q1_s1_c4", "Punctuality"));
		return questions;
	}
}
