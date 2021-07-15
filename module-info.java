module userfuncsimp {
	requires userfuncs;
	
	provides userfuncs.binaryfuncs.BinaryFuncProvider with
			userfuncsimp.binaryfuncsimp.SumAbsProvider,
			userfuncsimp.binaryfuncsimp.ResAbsProvider;
}