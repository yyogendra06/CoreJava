package in.function;

import java.util.function.BiConsumer;

public class _BiConsumer {
	public static void main(String[] args) {

		ConsumerModel consumer = new ConsumerModel("Alexander", 9999999);

		System.out.println("Consumer  method normal");
		greetConsumer(consumer, true);

		System.out.println("Consumer Fucntion");
		greetConsumerFunction.accept(consumer, false);

	}

	static BiConsumer<ConsumerModel, Boolean> greetConsumerFunction = (consumer,
			showPhoneNumber) -> System.out.println("Hello "
					+ consumer.consumerName + ", thanks for registering on "
					+ (showPhoneNumber ? consumer.consumerPhone : "******"));

	static void greetConsumer(ConsumerModel consumer, Boolean showPhoneNumber) {
		System.out.println("Hello " + consumer.consumerName
				+ ", thanks for registering on "
				+ (showPhoneNumber ? consumer.consumerPhone : "******"));
	}

	static class ConsumerModel {
		private final String consumerName;
		private final Long consumerPhone;

		public ConsumerModel(String consumerName, int i) {
			super();
			this.consumerName = consumerName;
			this.consumerPhone = (long) i;
		}

	}
}
