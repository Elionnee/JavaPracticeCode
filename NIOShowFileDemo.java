package Pruebas3;
import java.io.*;
import java.nio.file.*;

public class NIOShowFileDemo {
	public static void main(String args[]) {
		int i;
		try(BufferedInputStream fin = new BufferedInputStream(Files.newInputStream(Path.of("test.txt")))) {
			do {
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while(i != -1);
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error " + e);
		}
	}
}