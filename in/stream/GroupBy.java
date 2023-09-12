package in.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import in.model.DataSource;
import in.model.Questions;

public class GroupBy {

	public static void main(String[] args) {

		List<Questions> questions = DataSource.getQuestions();

		Function<Questions, String> classifier = ques -> {
			int lastIndex = ques.getQuestionId().indexOf("_");
			if (lastIndex == -1)
				lastIndex = ques.getQuestionId().length();

			return ques.getQuestionId().substring(0, lastIndex);
		};

		Function<Questions, String> classifier1 = ques -> {
			int lastIndex = ques.getQuestionId().indexOf("_",
					ques.getQuestionId().indexOf("q"));
			if (lastIndex == -1)
				lastIndex = ques.getQuestionId().length();

			return ques.getQuestionId().substring(0, lastIndex);
		};

		Function<Questions, String> classifier2 = ques -> {
			int lastIndex = ques.getQuestionId().indexOf("_",
					ques.getQuestionId().indexOf("s"));
			if (lastIndex == -1)
				lastIndex = ques.getQuestionId().length();

			return ques.getQuestionId().substring(0, lastIndex);
		};

		Function<Questions, String> classifiern = ques -> {
			int lastIndex = ques.getQuestionId().lastIndexOf("_");
			if (lastIndex == -1)
				lastIndex = ques.getQuestionId().length();

			return ques.getQuestionId().substring(0, lastIndex);
		};

		System.out.println(questions.stream().sorted(
				(q1, q2) -> q1.getQuestionId().compareTo(q2.getQuestionId()))
				.collect(Collectors.groupingBy(classifier,
						Collectors.groupingBy(classifier1,
								Collectors.groupingBy(classifier2)))));

		// System.out.println(questions.stream().sorted(
		// (q1, q2) -> q1.getQuestionId().compareTo(q2.getQuestionId()))
		// .collect(Collectors.toMap(Questions::getQuestionId,
		// question -> question)));
	}

}
