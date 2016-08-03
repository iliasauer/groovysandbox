package gdk.io

import org.junit.Test

/**
 * Created on 03.08.16.
 */
public class FileUtilTest {

	@Test
	public void shouldPrintFile() {
		FileUtil.printFile('test.txt')
	}

	@Test
	public void shouldPrintFileWithReader() {
		FileUtil.printFileWithReader('test.txt')
	}

}
