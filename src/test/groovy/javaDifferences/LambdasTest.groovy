package javaDifferences

import org.junit.Test

/**
 * Created on 03.08.16.
 */
class LambdasTest {

	@Test
	void shouldRunSomeTask() {
		def lambdas = new Lambdas();
		lambdas.demoRunnable();
	}

	@Test
	void shouldIterateAsForEach() {
		def lambdas = new Lambdas();
		lambdas.demoForEach();
	}
}
