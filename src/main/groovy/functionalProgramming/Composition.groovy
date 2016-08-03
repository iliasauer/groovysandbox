package functionalProgramming

/**
 * Created on 03.08.16.
 */
class Composition {
	private def plus2 = { it + 2 }
	private def times3 = { it * 3 }
	def times3plus2 = times3 >> plus2
	def plus2times3 = plus2 >> times3
}
