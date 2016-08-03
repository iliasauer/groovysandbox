package javaDifferences

import org.junit.Test

/**
 * Created on 03.08.16.
 */
class ArmBlocksTest {

	private static final def FILE_PATH_STR = "./test.txt"

	@Test
	public void shouldPrintFile() {
		def armBlocks = new ArmBlocks()
		armBlocks.printFile(FILE_PATH_STR)
	}

	@Test
	public void shouldPrintFileToo() {
		def armBlocks = new ArmBlocks()
		armBlocks.printFileInJavaStyle(FILE_PATH_STR)
	}
}
