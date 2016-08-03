package closures

/**
 * Created on 03.08.16.
 */
class NestedClosures {

	void run() {
		def nestedClosuresThis = {
			def cl = { this }
			cl()
		}
		def nestedClosuresOwner = {
			def cl = { owner }
			cl()
		}
		assert this == nestedClosuresThis() && nestedClosuresThis() != nestedClosuresOwner()
	}

}
