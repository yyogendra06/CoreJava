package in.reflect;

import java.lang.reflect.Method;

class Test1 {

}

public class ClassMethodsApp {
	public static void main(String[] args) {
		Test1 testObj = new Test1();

		System.out.println("The public methods of class are : ");

		// Getting methods of the class through the object
		// of the class by using getMethods
		Method[] methods = testObj.getClass().getMethods();

		// Printing method names
		for (Method method : methods)
			System.out.println(method.getName());
	}
}
