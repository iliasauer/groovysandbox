package functionalProgramming

/**
 * Created on 03.08.16.
 */
class Currying {

	def nCopies = { int n, String str -> str * n }

	public def leftCurrying(int newN, String s) {
		def nice = nCopies.curry(newN)
		assert twice(s) == nCopies(newN, s)
	}

	public def rightCurrying(int n, String newS) {
		def sh = nCopies.rcurry(newS)
		assert sh(n) == nCopies(n, newS)
	}

}
