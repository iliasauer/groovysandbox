package functionalProgramming

import org.junit.Before
import org.junit.Test

/**
 * Created on 03.08.16.
 */
class CurryingTest {

	Currying currying

	@Before
	public void setUpTest() {
		currying = new Currying()
	}

	@Test
	public void shouldDoLeftCarrying() {
		currying.leftCurrying(5, 'bla')
	}

	@Test
	public void shouldDoRightCarrying() {
		currying.rightCurrying(5, 'bla')
	}
}
