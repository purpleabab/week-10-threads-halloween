package rahmeier.karen.threaddemo;

import org.apache.log4j.Logger;

/**
 * Created by karen.rahmeier on 11/8/2016.
 */
public class ThreadSafeCounter {
    private final Logger log = Logger.getLogger(this.getClass());
    private int numberOfKidsWaiting;  // The value of the counter.

    public ThreadSafeCounter(int numberOfKidsWaiting) {
        this.numberOfKidsWaiting = numberOfKidsWaiting;
    }

    synchronized public void increment() {
        numberOfKidsWaiting = numberOfKidsWaiting + 1;
    }

    synchronized public void decrement() {
        numberOfKidsWaiting = numberOfKidsWaiting - 1;
    }

    synchronized public int getNumberOfKidsWaiting() {
        return numberOfKidsWaiting;
    }



    /**
     *
     *         synchronized (threadSafeCounter) {
     if (threadSafeCounter.getNumberOfKidsWaiting() == 0) {
     childGeneratorThread.start();
     threadSafeCounter.increment();
     }

     }
     * */

}
