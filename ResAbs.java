package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class ResAbs implements BinaryFunc {
	// Devuelve el nombre de esta funci�n.
    public String getNombre(){
        return "restarAbsolutos";
    }

    //Implementa la funci�n ResAbs.
    public int func(int a, int b){
        return Math.abs(a)- Math.abs(b);
    }
}
