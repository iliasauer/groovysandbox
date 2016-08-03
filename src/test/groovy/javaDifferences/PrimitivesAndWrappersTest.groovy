package javaDifferences

import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.assertEquals

/**
 * Created on 03.08.16.
 */
class PrimitivesAndWrappersTest {

	@Test
	public void shouldCallIntegerMethod() {
		def wrappers = new PrimitivesAndWrappers()
		Assert.assertEquals(2, wrappers.method(wrappers.intVar))
	}
}
