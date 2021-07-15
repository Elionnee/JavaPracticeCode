package Pruebas1;

public class StringHandlig_StringBuffer {

	public static void main(String [ ] args) {
		
		int tamOcupado = 0;
		int tamTotal = 0;
		int tamReservado = 0;

		
		System.out.println("------------------- BUFFER 1 -------------------");
		System.out.println("--------------- Contructor vacio ---------------");
		System.out.println();
		
		StringBuffer buffer = new StringBuffer("");
		tamOcupado = buffer.length();
		tamTotal = buffer.capacity();
		tamReservado = tamTotal - tamOcupado;
		
		System.out.println("Tamaño ocupado : " + tamOcupado);
		System.out.println("Tamaño reservado : " + tamReservado);
		System.out.println("Tamaño total : " + tamTotal);
		
		System.out.println();
		System.out.println();
		System.out.println("------------------- BUFFER 2 -------------------");
		System.out.println("------------ Contructor con string ------------");
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer("Hola");
		tamOcupado = buffer2.length();
		tamTotal = buffer2.capacity();
		tamReservado = tamTotal - tamOcupado;
		
		System.out.println("Tamaño ocupado : " + tamOcupado);
		System.out.println("Tamaño reservado : " + tamReservado);
		System.out.println("Tamaño total : " + tamTotal);
		
		
		System.out.println();
		System.out.println();
		System.out.println("------------------- BUFFER 3 -------------------");
		System.out.println("---- Contructor con string + set lenght 40 ----");
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("Hola");
		tamOcupado = buffer3.length();
		tamTotal = buffer3.capacity();
		tamReservado = tamTotal - tamOcupado;
		
		buffer3.setLength(40);
		
		tamOcupado = buffer3.length();
		tamTotal = buffer3.capacity();
		tamReservado = tamTotal - tamOcupado;
		
		System.out.println("Tamaño ocupado : " + tamOcupado);
		System.out.println("Tamaño reservado : " + tamReservado + "     "
				+ "> NOTA: Si le pones setLength(42) no reserva ningún caracter");
		System.out.println("Tamaño total : " + tamTotal);
		
		
		

	}
}
