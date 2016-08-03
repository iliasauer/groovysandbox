package javaDifferences.innerClasses

import java.util.concurrent.CountDownLatch

/**
 * Created on 03.08.16.
 */
class AnonymousInnerClasses {

	private def latch = new CountDownLatch(1)

	def getLatch() {
		return latch
	}

	public void demo() {
		def timer = new Timer()
		timer.schedule(new TimerTask() {
			@Override
			void run() {
				latch.countDown()
			}
		}, 0)
	}

}
