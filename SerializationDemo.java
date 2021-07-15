package Pruebas3;
import java.io.*;

public class SerializationDemo {
	public static void main(String args[]) {
		// Serialización
		try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
			ClasePruebaSerializable objA = new ClasePruebaSerializable("Hello", -7, 2.7e10);
			System.out.println("Objeto A : " + objA);
			objOStrm.writeObject(objA);
		} catch(IOException e) {
			System.out.println("Excepción durante la serialización : " + e);
		}
		
		// Deserealización
		try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
			ClasePruebaSerializable objB = (ClasePruebaSerializable) objIStrm.readObject();
			System.out.println("Objeto B : " + objB);
		} catch(Exception e) {
			System.out.println("Excepción durante la deserialización : " + e);
		}
	}
}
