package Pruebas3;
import java.io.*;
import java.nio.file.*;

public class NIOMostrarArbolDeContenidosDeUnDirectorioDemo {
	public static void main(String args[]) {
		String dir = "C:\\Users\\snc\\javaWorkSpace\\dirPrueba";
		System.out.println("El árbol de directorios comienza en : " + dir + " \n");
		
		try {
			Files.walkFileTree(Path.of(dir), 
					new NIOMostrarArbolDeContenidosDeUnDirectorioDemo_Extra_MyFileVisitor());
		} catch(IOException e) {
			System.out.println("I/O Error");
		}
		
	}
}
