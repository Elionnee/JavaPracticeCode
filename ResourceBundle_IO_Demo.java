package ResourceBundles_IO_Pruebas;
import java.awt.Desktop;
import java.io.*;
import java.util.*;

public class ResourceBundle_IO_Demo {
	public static void main(String args[]) throws IOException {
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundles_IO_Pruebas.SampleResourceBundle");
		
		System.out.println("Default version (English) : ");
		System.out.println("Title : " + rb.getString("Title"));
		System.out.println("Stop : " + rb.getString("StopText"));
		System.out.println("Start : " + rb.getString("StartText") + "\n");

		rb = ResourceBundle.getBundle("ResourceBundles_IO_Pruebas.SampleResourceBundle_es");
		
		System.out.println("Versión española : ");
		System.out.println("Título : " + rb.getString("Titulo"));
		System.out.println("Pausa : " + rb.getString("TextoParada"));
		System.out.println("Inicio : " + rb.getString("TextoInicio"));
		
		System.out.println("\n\n ------------------------PRUEBA DE I/O------------------------ \n");
		
		File f1 = new File("AS.txt");
		
		if(!Desktop.isDesktopSupported()){  
			System.out.println("not supported");  
			return;  
		} else {
			try {
				BufferedReader br =new BufferedReader(new FileReader(f1));
				int r=0;  
				while((r=br.read())!=-1)  {  
					System.out.print((char)r);  
				}
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}  
			System.out.println("\n\nFile Name : " + f1.getName());
			System.out.println("Path : " + f1.getPath());
			System.out.println("Absolute Path : " + f1.getAbsolutePath());
			System.out.println("Parent : " + f1.getParent());
			System.out.println(f1.exists() ? "Existe" : "No existe");
			System.out.println(f1.canWrite() ? "Se puede escribir" : "No se puede escribir");
			System.out.println(f1.canRead() ? "Se puede leer" : "No se puede leer");
			System.out.println("¿Directorio? " + (f1.isDirectory() ? "Sí es" : "No es"));
			System.out.println(f1.isFile() ? "Es un archivo" : "No es un archivo");
			System.out.println(f1.isAbsolute() ? "Es absoluto" : "No es absoluto");
			System.out.println("Última fecha de modificación : " + f1.lastModified());
			System.out.println("Tamaño del archivo : " + f1.length() + " Bytes");
		}
	}
}