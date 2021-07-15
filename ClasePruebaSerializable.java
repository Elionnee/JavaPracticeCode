package Pruebas3;

import java.io.*;


public class ClasePruebaSerializable implements Serializable {
	private static final long serialVersionUID = 8044402913692037424L;
	String s;
	int i;
	double f;
	
	public ClasePruebaSerializable (String s, int i, double f) {
		this.s = s;
		this.i = i;
		this.f = f;
	}
	
	public String toString() {
		return "String = " + s + " , int = " + i + " , double = " + f;
	}
}
