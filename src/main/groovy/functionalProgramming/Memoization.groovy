package functionalProgramming

/**
 * Created on 03.08.16.
 */
class Memoization {

	def fibbonachiSlow(long n) {
		def fib
		fib = {long m ->
			if (m < 2) {
				return m
			} else {
				return fib(m - 1) + fib(m - 2)
			}
		}
		fib(n)
	}

	def fibbonachiFast(long n) {
		def fib
		fib = {long m ->
			if (m < 2) {
				return m
			} else {
				return fib(m - 1) + fib(m - 2)
			}
		}.memoize()
		fib(n)
	}

}
