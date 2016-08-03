package functionalProgramming

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals
/**
 * Created on 03.08.16.
 */
class TrampolineTest {

	Trampoline trampoline

	@Before
	public void setUp() {
		trampoline = new Trampoline()
	}

	@Test
	public void shouldFactorial() {
		assertEquals(new BigInteger(6), trampoline.factorialWithTrampoline(3))
	}
}
