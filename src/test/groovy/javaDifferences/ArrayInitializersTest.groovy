package javaDifferences

import org.junit.Test

import static org.junit.Assert.assertEquals

/**
 * Created on 03.08.16.
 */
class ArrayInitializersTest {

	@Test
	void shouldGetArrayElement() {
		def arrayInit = new ArrayInitializers();
		assertEquals(1, arrayInit.array.getAt(0))
	}

}
