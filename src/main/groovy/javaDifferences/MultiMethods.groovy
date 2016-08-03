package javaDifferences
/**
 * Created on 03.08.16.
 */
class MultiMethods {

	private Object stringAsObject ="Object";

	public Object getStringAsObject() {
		return stringAsObject
	}

	public int method(String arg) {
		println "Called method for strings"
		1;
	}

	public int method(Object arg) {
		println "Called method for objects"
		2;
	}

}
