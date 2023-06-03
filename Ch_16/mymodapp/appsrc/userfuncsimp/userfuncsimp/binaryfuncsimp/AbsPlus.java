// AbsPlus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) + abs(b).
package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

class AbsPlus implements BinaryFunc {
	public String getName() {
		return "absPlus";
	}

	public int func(int a, int b) {
		return Math.abs(a) + Math.abs(b);
	}
}