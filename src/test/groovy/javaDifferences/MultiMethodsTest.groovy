package javaDifferences

import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.assertEquals
/**
 * Created on 03.08.16.
 */
class MultiMethodsTest {

	@Test
	public void shouldCallStringMethod() {
		def multiMethods = new MultiMethods()
		Assert.assertEquals(1, multiMethods.method(multiMethods.stringAsObject))
	}

}
