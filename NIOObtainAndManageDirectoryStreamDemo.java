package Pruebas3;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class NIOObtainAndManageDirectoryStreamDemo {
	public static void main(String args[]) {
		String dir = "C:\\Users\\snc\\javaWorkSpace\\dirPrueba";
		
		try(DirectoryStream<Path> dirS =  Files.newDirectoryStream(Path.of(dir))) {
			System.out.println("Directorio : " + dir);
			
			for (Path entrada : dirS) {
				BasicFileAttributes att =  Files.readAttributes(entrada, BasicFileAttributes.class);
				if(att.isDirectory()) System.out.println("\n<DIR> ");
				else System.out.println("        ");
				
				System.out.println(entrada.getName(4));
			}
		} catch(InvalidPathException e) {
			System.out.println("Path Error : " + e);
		} catch(NotDirectoryException e) {
			System.out.println(dir + " no es un directorio.");
		} catch(IOException e) {
			System.out.println("I/O Error : " + e);
		}
	}
}
