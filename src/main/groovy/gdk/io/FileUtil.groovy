package gdk.io

/**
 * Created on 03.08.16.
 */
public class FileUtil {

	private static final def printLineWithNumber = { lineString, lineNumber ->
			println "$lineNumber: $lineString"
	}

	public static void printFile(String filePath) {
		new File(filePath).eachLine printLineWithNumber
	}

	public static void printFileWithReader(String filePath) {
		new File(filePath).withReader { reader ->
			reader.eachLine printLineWithNumber
		}
	}



}
