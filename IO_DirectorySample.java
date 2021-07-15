package ResourceBundles_IO_Pruebas;
import java.io.*;

public class IO_DirectorySample {
	public static void main(String args[]) {
		String dir = "C:/Users/snc/javaWorkSpace/Pruebas/src/Pruebas1";
		File f = new File(dir);
		
		if (f.isDirectory()) {
			System.out.println("Directorio : " + dir + "\n\n");
			String s[] = f.list();
			
			for (int i = 0; i < s.length; i++) {
				File fi = new File (dir + "/" + s[i]);
				if (fi.isDirectory()) {
					System.out.println(s[i] + " es un directorio. \n");
				} else {
					System.out.println(s[i] + " no es un directorio. \n");
				}
			}
		} else {
			System.out.println(dir + " no es un directorio.");

		}
	}
}
