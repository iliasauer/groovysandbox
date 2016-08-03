package syntax

import org.junit.Test

import static org.junit.Assert.assertTrue

/**
 * Created on 03.08.16.
 */
class QuotedIdentifiersTest {

	@Test
	public void shouldFindEntry() {
		def quotedIdentifiers = new QuotedIdentifiers()
		assertTrue quotedIdentifiers.map[QuotedIdentifiers.KEY_WITH_SPACE_AND_SINGLE_QUOTES] ==
			QuotedIdentifiers.VALUE_BY_DEFAULT
	}

	@Test
	public void shouldFindSurname() {
		def quotedIdentifiers = new QuotedIdentifiers()
		assertTrue quotedIdentifiers.map[QuotedIdentifiers.NAME] == QuotedIdentifiers.SURNAME
	}


}
