package in.date;

import java.util.Calendar;

public class CalendarApp {
	public static void main(String[] args) {

		String year = "2021";

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -1);
		year = String.valueOf(calendar.get(Calendar.YEAR));

		System.out.println(year);
	}
}
