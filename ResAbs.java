package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class ResAbs implements BinaryFunc {
	// Devuelve el nombre de esta función.
    public String getNombre(){
        return "restarAbsolutos";
    }

    //Implementa la función ResAbs.
    public int func(int a, int b){
        return Math.abs(a)- Math.abs(b);
    }
}
