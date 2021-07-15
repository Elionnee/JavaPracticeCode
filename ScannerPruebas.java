package Pruebas1;

import java.util.Scanner;

public class ScannerPruebas {
	public static void main(String args[]) {
		
		int count = 0;
		double total = 0.0;
		
		System.out.println("Introduzca la lista de números deseados : \n");
		
		try (Scanner scn = new Scanner(System.in)) {
			while(scn.hasNext()) {
				if (scn.hasNextDouble()) {
					total += scn.nextDouble();
					count++;
				} else {
					String str = scn.next();
					if (str.equals("Done")) break;
					else {
						System.out.println("Data format error");
						return;
					}
				}
			}
			// scn.close();      Si esta dentro de un try-with-resosurces no necesitas cerrarlo
			// explicitamente, puesto que dentro de este try se auto-cierra.
		}
		
		System.out.println("La media de la lista obtenida es : " + total/count);
	}
}
