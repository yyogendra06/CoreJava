package in.string;

public class StringMultiThreadingApp {

	public void getStringBufferPerformance() {

		StringBuffer strBufferOne = new StringBuffer();
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			strBufferOne.append(i);
			strBufferOne.append(" ");
			strBufferOne.append(i);
			strBufferOne.append(" ");
		}

		System.out.println("Time Taken by StringBuffer is: " + (System.currentTimeMillis() - startTime) + " ms");

	}

	public void getStringBuilderPerformance() {

		StringBuilder strBuilderOne = new StringBuilder();
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			strBuilderOne.append(i);
			strBuilderOne.append(" ");
			strBuilderOne.append(i);
			strBuilderOne.append(" ");
		}

		System.out.println("Time Taken by StringBuilder is: " + (System.currentTimeMillis() - startTime) + " ms");

	}

	public static void main(String[] args) {

		StringMultiThreadingApp app = new StringMultiThreadingApp();
		app.getStringBufferPerformance();
		app.getStringBuilderPerformance();
	}
}
