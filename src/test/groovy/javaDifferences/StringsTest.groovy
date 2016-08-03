package javaDifferences

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue


/**
 * Created on 03.08.16.
 */
class StringsTest {

	private Strings strings

	@Before
	public void setUp() {
		strings = new Strings()
	}

	@Test
	public void shouldCheckGString() {
		assertTrue(strings.gStringClass() in GString)
	}

	@Test
	public void shouldPrintMultilineString() {
		println strings?.multilineString
	}

	@Test
	public void shouldPrintInterpolatedExpression() {
		println strings?.interpolatedExpression
	}

	@Test
	public void shouldPrintInterpolatedMap() {
		println strings?.interpolatedMap
	}

	@Test
	public void shouldPrintInterpolatedStringWriterClosure() {
		println strings?.interpolatedStringWriterClosure
	}

}
