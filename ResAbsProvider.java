package userfuncsimp.binaryfuncsimp;
import userfuncs.binaryfuncs.*;

public class ResAbsProvider implements BinaryFuncProvider {

	// Proporciona un objeto ResAbs.
	public BinaryFunc get(){
		return new ResAbs();
	}

}
