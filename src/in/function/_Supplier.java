package in.function;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {

		System.out.println(getDbUrl.get());
	}

	static Supplier<String> getDbUrl = () -> "localhost/test";
}
