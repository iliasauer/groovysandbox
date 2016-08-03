package functionalProgramming

/**
 * Created on 03.08.16.
 */
class Trampoline {

	public def factorialWithTrampoline(int m, def acc = 1g) {
		def factorial
		factorial = {int n, def accumulator = 1g ->
			if (n < 2) {
				return accumulator
			} else {
				factorial.trampoline(n - 1, n * accumulator)
			}
		}
		factorial = factorial.trampoline()
		factorial(m, acc)
	}

}
