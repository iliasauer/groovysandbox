package closures

/**
 * Created on 03.08.16.
 */
class Enclosing {
	void run() {
		def whatIsThis = { this }
		def whatIsOwner = { owner }
		def whatIsDelegate = { delegate }
		assert whatIsThis() == whatIsOwner() && whatIsOwner() == whatIsDelegate()
		def enclosed = {{ -> delegate }.call()}
		assert enclosed == enclosed()
	}
}
