package Pruebas1;

import java.util.*;

// Interfaces necesarias para las expresiones de lambda
interface printFunction {
	void run(String str);
}

interface IntTest{
	boolean run(Integer num);
}

interface IntsTest{
	boolean run(Integer num, Integer num2);
}

interface NumericFunction{
	Integer func(Integer num);
}

interface StringFunction{
	String func(String str);
}

interface Function<T>{
	T func(T t);
}

interface Function2Arg<T, K>{
	T func(T t, K k);
}

public class LambdaPrueba {
	
	private double presupuestoFinal = 0.0;
	
	public static String stringOp(Function<String> sf, String s) {
		return sf.func(s);
	}
	
	
	public double calculaPresupuesto(Function2Arg<Double, String> gastoMantenimiento, 
			Function2Arg<Double, Integer> gastoStock, Function2Arg<Double, Integer> ganancia, 
				double mant, double precioMStock, int numPedidos, int numVentas, 
					double precioPorVenta, String tipoMant) {
		
		gastoMantenimiento.func(mant, tipoMant);
		gastoStock.func(precioMStock, numPedidos);
		ganancia.func(precioPorVenta, numVentas)
		;
		
		return presupuestoFinal;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		
		System.out.println(""); 
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		System.out.println("------------------------------Single Lambdas------------------------------");
		System.out.println("//////////////////////////////////////////////////////////////////////////"); 
		System.out.println("");
		
		// Single lambdas

		// Expresión de lambda que determina si un número es impar.
		IntTest methodNum =  (n) -> n % 2 != 0;

		// Expresión de lambda que imprime el string indicado.
		printFunction methodStr = (n) -> { System.out.println(n); };

		for (Integer i : numbers) {
			if (methodNum.run(i)) {
				methodStr.run("Num : " + i + " no es divisible entre 2." );
			}

		} 

		// Expresión de lambda que comprueba si un número es factor de otro.
		IntsTest isFactor = (n, m) -> (n % m) == 0;
		if (isFactor.run(numbers.get(2), numbers.get(3))) System.out.println("El número " + numbers.get(2) + " es factor del número " + numbers.get(3));


		System.out.println(""); 
		System.out.println("///////////////////////////////////////////////////////////////////////////");
		System.out.println("-------------------------------Block Lambdas-------------------------------");
		System.out.println("///////////////////////////////////////////////////////////////////////////"); 
		System.out.println("");


		
		// Block lambdas

		// Expresión de lambda que obtiene el factorial de un número.
		NumericFunction factorial = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}

			return result;
		};
		methodStr.run("Factorial de " + numbers.get(2) + " es : " + factorial.func(numbers.get(2)));


		// Expresión de lambda que obtiene el factorial de un número. 
		// Utiliza una interfaz genérica.
		Function<Integer> factorialGen = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}

			return result;
		};

		methodStr.run("Factorial de " + numbers.get(2) + " es : " + factorialGen.func(numbers.get(2)));


		// Expresión de lambda que da la vuelta a los caracteres de una frase.
		StringFunction strReverse = (n) -> {
			String result = "";
			for (int i = (n.length() - 1); i >= 0; i--) {
				result += n.charAt(i);
			}
			return result;
		};

		methodStr.run(strReverse.func("Hola, mi nombre es Paco"));

		// Expresión de lambda que da la vuelta a los caracteres de una frase. 
		// Utiliza una interfaz genérica.
		Function<String> strReverseGen = (n) -> {
			String result = "";
			for (int i = (n.length() - 1); i >= 0; i--) {
				result += n.charAt(i);
			}
			return result;
		};

		methodStr.run(strReverseGen.func("Hola, mi nombre es Paco"));
		
		
		
		System.out.println(""); 
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		System.out.println("---------------------------Lambdas as arguments---------------------------");
		System.out.println("//////////////////////////////////////////////////////////////////////////"); 
		System.out.println("");

		
		
		String inStr = "Lambdas add power to Java" ;
		String outStr;
		System.out.println("Input String : " + inStr);
		
		// Función que, usando una expresión lambda, elimina los especios de una frase.
		outStr = stringOp((str) -> {
				String result = ""; 
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) != ' ')
						result += str.charAt(i);
				}
				return result;
			}, inStr);
		
		System.out.println("El string sin espacios es : " + outStr);
		
		Function<String> upperCase = (n) -> n.toUpperCase();
		// Función que, usando una expresión lambda, pone una frase en mayúsculas.
		outStr = stringOp(upperCase, inStr);
		
		System.out.println("El string en mayúsculas es : " + outStr);
		
		// Function2Arg<Double, String> gastoMantenimiento;
		// Function2Arg<Double, Integer> gastoStock;
		// Function2Arg<Double, Integer> ganancia;
	}
}
