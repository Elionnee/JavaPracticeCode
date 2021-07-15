package Pruebas3;
import java.io.*;
import java.nio.file.*;

public class NIOCopyDemo {
	public static void main(String args[]) {
		
		
		try {
			Path origen = Path.of("C:\\Users\\snc\\javaWorkSpace\\Pruebas\\test.txt");
			Path destino = Path.of("C:\\Users\\snc\\javaWorkSpace\\archivoPrueba\\");
			
			Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch(InvalidPathException e) {
			System.out.println("Path Error " + e);
		} catch(IOException e) {
			System.out.println("I/O Error " + e);
		}
	}
}
