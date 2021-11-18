package in.practice;

public class AMPMTo24HourFormatApp {

	public static String get24HourFormatString(String s) {

		String shift = s.substring(s.length() - 2);

		String[] arrayOfTime = s.substring(0, s.length() - 2).split(":");

		StringBuffer timeFormat = new StringBuffer();

		Integer hour = Integer.parseInt(arrayOfTime[0]);

		if (shift.equals("PM")) {
			if (hour < 12 && hour > 0)
				timeFormat.append(12 + hour);
			else if (hour == 12)
				timeFormat.append(12);

		} else if (shift.equals("AM")) {
			if (hour == 12)
				timeFormat.append("00");
			else if (hour < 12 && hour > 0)
				timeFormat.append(arrayOfTime[0]);
		}

		for (int i = 1; i < arrayOfTime.length; i++)
			timeFormat.append(":" + arrayOfTime[i]);

		return timeFormat.toString();
	}

	public static void main(String[] args) {
		System.out.println(get24HourFormatString("07:05:45PM"));
		System.out.println(get24HourFormatString("06:40:03AM"));
	}
}
