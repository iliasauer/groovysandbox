package javaDifferences

import java.util.concurrent.Executors

/**
 * Created on 03.08.16.
 */
class Lambdas {

	private Runnable task = { println 'run task' }

	public void demoRunnable() {
		def executor = Executors.newSingleThreadExecutor()
		executor.submit(task)
	}

	public void demoForEach() {
		def strings = ['ilya', 'andrey', 'goose', 'mongoose']
		strings.each { println it }
	}
}
