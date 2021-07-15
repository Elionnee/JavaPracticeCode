package Pruebas3;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class NIOObtainingInformationAboutPathOrFileDemo {
	public static void main(String args[]) {
		Path filepath = Path.of("C:\\Users\\snc\\Downloads\\Hey.txt");
		System.out.println("File Name : " + filepath.getName(0));
		System.out.println("Path : " + filepath);
		System.out.println("Absolute Path : " + filepath.toAbsolutePath());
		System.out.println("Parent : " + filepath.getParent());
		
		if (Files.exists(filepath)) {
			System.out.println("El archivo existe.");
		} else {
			System.out.println("El archivo no existe.");
		} 
		
		try {
			if(Files.isHidden(filepath)) {
				System.out.println("El archivo esta oculto.");
			} else {
				System.out.println("El archivo no esta oculto.");
			}
		} catch(IOException e) {
			System.out.println("I/O Error : " + e);		
		}
		
		if(Files.isWritable(filepath)) System.out.println("Se puede escribir.");
		if(Files.isReadable(filepath)) System.out.println("Se puede leer.");
		
		try {
			BasicFileAttributes attribs = Files.readAttributes(filepath, 
					BasicFileAttributes.class);
			
			if(attribs.isDirectory()) System.out.println("Es un directorio.");
			else System.out.println("No es un directorio.");
			
			if(attribs.isRegularFile()) System.out.println("El archivo es normal.");
			else System.out.println("El archivo no es normal.");
			
			if(attribs.isSymbolicLink()) System.out.println("El archivo es un link simbólico.");
			else System.out.println("El archivo no es un link simbólico.");
			
			System.out.println("Última modificaión : " + attribs.lastModifiedTime());
			System.out.println("Tamaño del archivo : " + attribs.size() +  "Bytes.");
		} catch(IOException e) {
			System.out.println("I/O Error leyendo los atributos : " + e);
		}
	}
}
