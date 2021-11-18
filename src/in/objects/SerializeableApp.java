package in.objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializeableClass implements Serializable {
	int i;
	String s;

	public SerializeableClass(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

}

class NonSerializeable {
	int i;
	String s;

	public NonSerializeable(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}

}

public class SerializeableApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializeableClass serializeableClass = new SerializeableClass(10000, "String Field Entered");
		NonSerializeable nonSerializeableClass = new NonSerializeable(20000, "String Field Entered for non serialized");

		FileOutputStream fileOutputStream = new FileOutputStream("serialize.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(serializeableClass);
		// This will Give NotSerializableException
//		objectOutputStream.writeObject(nonSerializeableClass);

		FileInputStream fileInputStream = new FileInputStream("serialize.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		SerializeableClass fetchedClass = (SerializeableClass) objectInputStream.readObject();

		System.out.println(fetchedClass.i);
		System.out.println(fetchedClass.s);

		objectInputStream.close();
		objectOutputStream.close();
	}
}
