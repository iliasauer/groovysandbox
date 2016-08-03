package operators

import org.junit.Test

/**
 * Created on 03.08.16.
 */
class MethodPointerTest {

	@Test
	public void shouldTransformListWithClosure() {
		def persons = [
		    new MethodPointer.Person("Bob", 42),
		    new MethodPointer.Person("Julia", 35)
		]
		final def result = MethodPointer.transform(persons, MethodPointer.&describe)
		result.each {
			println it
		}
	}
}
