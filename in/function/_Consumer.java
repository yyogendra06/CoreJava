package in.function;

import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		ConsumerModel consumer = new ConsumerModel("Alexander", 9999999);

		System.out.println("Consumer  method normal");
		greetConsumer(consumer);

		System.out.println("Consumer Fucntion");
		greetConsumerFunction.accept(consumer);
	}

	static Consumer<ConsumerModel> greetConsumerFunction = consumer -> System.out
			.println("Hello " + consumer.consumerName + ", thanks for registering on " + consumer.consumerPhone);

	static void greetConsumer(ConsumerModel consumer) {
		System.out.println("Hello " + consumer.consumerName + ", thanks for registering on " + consumer.consumerPhone);
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
