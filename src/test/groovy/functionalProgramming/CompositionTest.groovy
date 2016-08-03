package functionalProgramming

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

/**
 * Created on 03.08.16.
 */
class CompositionTest {

	Composition composition

	@Before
	public void setUp() {
		composition = new Composition()
	}

	@Test
	public void shouldTimes3Plus2() {
		assertEquals(composition.times3plus2(3), 11)
	}

	@Test
	public void shouldPlus2Times3() {
		assertEquals(composition.plus2times3(3), 15)
	}
}
