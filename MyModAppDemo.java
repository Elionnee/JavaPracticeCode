package appstart.mymodappdemo;

import java.util.ServiceLoader;
import appfuncs.simplefunc.SimpleMathFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
	 public static void main(String[] args) {

	        // Primero, use las funciones incorporadas como antes.
	        if(SimpleMathFuncs.esDivisor(2,10));
	        System.out.println("2 es divisor de 10");

	        System.out.println("El divisor positivo más pequeño entre 33 y 99 es: "
	                            +SimpleMathFuncs.divPeq(33,99));
	        System.out.println("El divisor positivo más grande entre 33 y 99 es: "
	                +SimpleMathFuncs.divGra(33,99));

	        // Ahora, use operaciones definidas por el usuario basadas en el servicio.

	        // Establezca un service loader para funciones binarias.
	        ServiceLoader<BinaryFuncProvider> loadserv=
	                ServiceLoader.load(BinaryFuncProvider.class);

	        BinaryFunc binarias=null;

	        // Encuentre el proveedor de sumAbs y obtenga la función.
	        for (BinaryFuncProvider fbp:loadserv){
	            if (fbp.get().getNombre().equals("sumarAbsolutos")){
	                binarias=fbp.get();
	                break;
	            }
	        }

	        if (binarias !=null)
	            System.out.println("El resultado de la función sumarAbsolutos es: "+binarias.func(12,-6));
	        else
	            System.out.println("Función sumarAbsolutos no encontrada.");

	        // Ahora, encuentre el proveedor para ResAbs y obtenga la función.
	        for (BinaryFuncProvider fbp:loadserv){
	            if (fbp.get().getNombre().equals("restarAbsolutos")){
	                binarias=fbp.get();
	                break;
	            }
	        }

	        if (binarias !=null)
	            System.out.println("El resultado de la función restarAbsolutos es: "+binarias.func(12,-6));
	        else
	            System.out.println("Función restarAbsolutos no encontrada.");


	    }
}