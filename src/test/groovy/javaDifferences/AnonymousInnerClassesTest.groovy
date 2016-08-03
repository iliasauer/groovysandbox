package javaDifferences.innerClasses

import org.junit.Test

import java.util.concurrent.TimeUnit

import static junit.framework.Assert.assertTrue

/**
 * Created on 03.08.16.
 */
class AnonymousInnerClassesTest {

	@Test
	public void shouldCheckCountDownLatch() {
		def classes = new AnonymousInnerClasses();
		def latch = classes.latch
		classes.demo()
		assertTrue latch.await(10, TimeUnit.SECONDS)
	}

}
