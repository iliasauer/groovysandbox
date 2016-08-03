package javaDifferences.innerClasses

import org.junit.Test

/**
 * Created on 03.08.16.
 */
class InnerClassesTest {

	@Test
	public void shouldCreateInnerClassInstance() {
		def classes = new InnerClasses()
		InnerClasses.createInner(classes)
	}
}
