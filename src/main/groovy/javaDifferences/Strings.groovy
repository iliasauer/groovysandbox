package javaDifferences
/**
 * Created on 03.08.16.
 */
class Strings {

	private def gString = "c${1}"
	private def multilineString = '''line one
line two
line three'''
	private def interpolatedExpression = "The sum of 2 and 3 equals ${2 + 3}"
	private def map = [name: 'Guillaume', age: 36]
	private def interpolatedMap = "$map.name is $map.age years old"
	private def interpolatedStringWriterClosure = "1 + 2 = ${w -> w << (1 + 2)}"

	public Class<?> gStringClass() {
		gString.getClass()
	}

	public def getMultilineString() {
		multilineString
	}

	public def getInterpolatedExpression() {
		interpolatedExpression
	}

	public def getInterpolatedMap() {
		interpolatedMap
	}

	def getInterpolatedStringWriterClosure() {
		interpolatedStringWriterClosure
	}

}
