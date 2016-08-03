package closures

import org.junit.Test

/**
 * Created on 03.08.16.
 */
class EnclosedInInnerClassTest {

	@Test
	void shouldRun() {
		def enclosedInInnerClass = new EnclosedInInnerClass()
		enclosedInInnerClass.run()
	}
}
