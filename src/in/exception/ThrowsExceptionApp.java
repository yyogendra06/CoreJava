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
