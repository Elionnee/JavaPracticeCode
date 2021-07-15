package Pruebas1;
import java.io.*;

public class mainPruebasStream {
	public static void main (String [ ] args) throws IOException {
		String prueba;
		char pruba;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out, true);
	
		// Recoge hasta introducir un caracter de fin
		writer.println("--------------------------------------");
		writer.println("Read Line");
		prueba = reader.readLine();
		writer.println(prueba);
	
		// Solo recoge el 1� caracter pero continua bloqueando el resto 
		// del c�digo hasta introducir un caracter de fin
		writer.println("--------------------------------------");
		writer.println("Read");
		pruba = (char) reader.read();
		writer.println(pruba);
		
		// Recoge todos los caracteres en l�neas separadas hasta que se introduzca un '.'. 
		// No importa que los caracteres se introduzcan seguidos, ya que los separa en l�neas distintas.
		// Tampoco termina al introducir un caracter de FIN.
		writer.println("--------------------------------------");
		writer.println("Bucle Read");
		do {
			pruba = (char) reader.read();
			writer.println(pruba);
		} while(pruba != '.');
	}
}
