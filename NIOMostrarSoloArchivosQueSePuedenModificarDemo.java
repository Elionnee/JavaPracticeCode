package Pruebas3;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class NIOMostrarSoloArchivosQueSePuedenModificarDemo {
	public static void main(String args[]) {
		String dir = "C:\\Users\\snc\\javaWorkSpace\\dirPrueba";
		
		DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
			public boolean accept(Path filename) throws IOException {
				if(Files.isWritable(filename)) return true;
				return false;
			}
		};
		
		try(DirectoryStream<Path> dirS = Files.newDirectoryStream(Path.of(dir), how)) {
			System.out.println("Directorio : " + dir);
			for (Path  entrada : dirS) {
				BasicFileAttributes att = Files.readAttributes(entrada, 
						BasicFileAttributes.class);
				
				if(att.isDirectory()) System.out.println("<DIR>   ");
				else System.out.println("         ");
				
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
