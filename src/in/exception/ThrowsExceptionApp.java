package in.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionApp {

	public static void main(String args[]) {
		ReadWrite readWrite = new ReadWrite();
		try {
			readWrite.readFile();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			readWrite.saveFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// This will throws error while compliation so Unbale to execute whole Code so
		// its is clear that checked exception generate Complile Time exception
//		FileInputStream fileInputStream = new FileInputStream("c:/abc.txt");
	}

}

class ReadWrite {
	void readFile() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("c:/abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("c:/abc.txt");
	}
}
