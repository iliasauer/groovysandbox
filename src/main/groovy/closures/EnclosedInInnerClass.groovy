package closures

/**
 * Created on 03.08.16.
 */
class EnclosedInInnerClass {

	class Inner {
		def clThis = { this }
		def clOwner = { owner }
	}

	void run() {
		def inner = new Inner()
		def innerClThis = inner.clThis()
		def innerClOwner = inner.clOwner()
		assert this != inner && inner == innerClThis && innerClThis ==  innerClOwner
	}

}
