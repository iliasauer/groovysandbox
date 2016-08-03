package javaDifferences

import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Created on 03.08.16.
 */
class ArmBlocks {

	public static final def CHARSET_STR = 'UTF-8'

	public void printFile(String path) {
		new File(path).eachLine(CHARSET_STR) {
			println it
		}
	}

	public void printFileInJavaStyle(String path) {
		new File(path).withReader(CHARSET_STR) {
			reader ->
				reader.eachLine {
					println it
				}
		}
	}

}
