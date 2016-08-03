package functionalProgramming

import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created on 03.08.16.
 */
class MemoizationTest {

	Memoization memorization
	Long start, finish

	private void testTime() {
		println finish - start
	}

	@Before
	public void setUp() {
		memorization = new Memoization()
		start = System.currentTimeMillis()
	}

	@After
	public void tearDown() {
		finish = System.currentTimeMillis()
		testTime()
	}

	@Test
	public void testFibbonachiSlow() {
		memorization.fibbonachiSlow(25)
	}

	@Test
	public void testFibbonachiFast() {
		memorization.fibbonachiFast(25)
	}
}
