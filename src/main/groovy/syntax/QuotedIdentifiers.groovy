package syntax

/**
 * Created on 03.08.16.
 */
class QuotedIdentifiers {

	public static final def KEY_WITH_SPACE_AND_SINGLE_QUOTES = 'an identifier with a space and single quotes'
	public static final def VALUE_BY_DEFAULT = 'ALLOWED'
	public static final def NAME = 'Homer'
	public static final def SURNAME = 'Simpson'

	private def map = [:]

	def getMap() {
		return map
	}

	QuotedIdentifiers() {
		map.'an identifier with a space and single quotes' = VALUE_BY_DEFAULT
		map."$NAME" = SURNAME
	}
}
