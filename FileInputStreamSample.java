package ResourceBundles_IO_Pruebas;
import java.io.*;

public class FileInputStreamSample {
	public static void main(String args[]) {
		int size;
		System.out.println("\n\n----------------------------------------------------------------"
				+ "\n----------------------------------------------------------------"
				+ "\n-------------------------Input Stream--------------------------"
				+ "\n----------------------------------------------------------------"
				+ "\n----------------------------------------------------------------\n");
		try(FileInputStream f = new FileInputStream("C:/Users/snc/javaWorkSpace/"
				+ "Pruebas/src/ResourceBundles_IO_Pruebas/FileInputStreamSample.java")) {
			System.out.println("Total Available Bytes : " + (size = f.available()));
			
			int n = size / 40;
			System.out.println("Primeros " + n + " bytes del archivo leidos.");
			
			for (int i = 0; i < n; i++) {
				System.out.println((char) f.read());
			}
			
			System.out.println("\n Disponibles : " + f.available());
			System.out.println("Leyendo los siguientes : " + n + "Bytes.");
			
			byte b[] = new byte [n];
			if (f.read(b) != n) {
				System.err.println("No se pudieron leer los siguientes : " + n + "Bytes.");
			}
			System.out.println(new String (b, 0, n));
			System.out.println("\nDisponibles : " + (size = f.available()));
			System.out.println("Ignorando la mitad de los butes restantes con skip().");
			f.skip(size/2);
			System.out.println("Disponibles : " + f.available());
			
			System.out.println("Leyendo : " + n/2 + " del final del array.");
			if (f.read(b, n/2, n/2) != n/2) {
				System.err.println("No se pudieron leer : " + n/2 + " Bytes.");
			}
			
			System.out.println(new String(b, 0, b.length));
			System.out.println("\nDisponibles : " + f.available());
		} catch(IOException e) {
			System.out.println("I/O Error " + e);
		}
		
		System.out.println("\n\n----------------------------------------------------------------"
				+ "\n----------------------------------------------------------------"
				+ "\n-------------------------Output Stream--------------------------"
				+ "\n----------------------------------------------------------------"
				+ "\n----------------------------------------------------------------\n");
		
		String source = "Ahora es el momento en el que toda la humanidad\n" 
				+ " decide hacer lo mejor para el planeta\n"
				+ " y se extingue de una vez.";
		byte buf[] = source.getBytes();
		
		try(FileOutputStream f0 = new FileOutputStream("file0.txt");
			FileOutputStream f1 = new FileOutputStream("file1.txt");
			FileOutputStream f2 = new FileOutputStream("file2.txt")) {
			
			for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
			f1.write(buf);
			f2.write(buf, buf.length - buf.length/4, buf.length/4);
		} catch(IOException e) {
			System.out.println("Error de I/O detectado");
		}
	}
}
