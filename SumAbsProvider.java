package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.*;

public class SumAbsProvider implements BinaryFuncProvider {
	// Proporciona un objeto SumAbs.
	public BinaryFunc get(){
		// Devuelve un objeto SumAbs.
		return new SumAbs();
	}
}
