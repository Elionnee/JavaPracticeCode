package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.BinaryFunc;

public class SumAbs implements BinaryFunc {
	// Devuelve el nombre de esta funci�n.
	public String getNombre(){
		return "sumarAbsolutos";
	}

	//Implementa la funci�n SumAbs.
	public int func(int a, int b){
		return Math.abs(a)+Math.abs(b);
	}
}
