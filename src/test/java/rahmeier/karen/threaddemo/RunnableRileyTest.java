package rahmeier.karen.threaddemo;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karen.rahmeier on 11/3/2016.
 */
public class RunnableRileyTest {
    private final Logger log = Logger.getLogger(this.getClass());
    RunnableRiley runnableRiley;
    Thread runnableRileyThread;
    HalloweenChildGeneratorThread childGeneratorThread;
    ThreadSafeCounter threadSafeCounter;
    HalloweenChildCreator childCreator;


    public final static int THREE_SECONDS = 3; //3000;
    public final static int ALL_NIGHT = 300;//000000;

    @Before
    public void Setup() {
        childGeneratorThread = new HalloweenChildGeneratorThread();
        childGeneratorThread.start();

        runnableRiley = new RunnableRiley();
        Thread runnableRileyThread = new Thread(runnableRiley);
        runnableRileyThread.start();

        //initialize counter with zero kids waiting
        threadSafeCounter = new ThreadSafeCounter(0);

        childCreator = new HalloweenChildCreator();
    }

    @Test
    public void testHalloweenNight() throws InterruptedException {
        log.info("running the test");
        assertTrue(true);

        log.info("begin trick or treating");
        //runnableRileyThread.start();

//        for (int i = 0; i <= 20; i++) {
//
        if (threadSafeCounter.getNumberOfKidsWaiting() == 0) {
            log.info("Riley watches tv");
            log.info("start creating trick-or-treat children");

            String childName = childCreator.createTrickOrTreater(threadSafeCounter.getNumberOfKidsWaiting());
            log.info("created " + childName);
            threadSafeCounter.increment();
            runnableRileyThread.sleep(ALL_NIGHT);
        } else if (threadSafeCounter.getNumberOfKidsWaiting() < 10) {
            log.info("between 1 and 10 kids are waiting, wake Riley up");
            runnableRileyThread.interrupt();
            log.info("Riley gives candy");
            threadSafeCounter.decrement();
        }
    }
//
//        synchronized (threadSafeCounter) {
//        if (threadSafeCounter.getNumberOfKidsWaiting() == 0) {
//            childGeneratorThread.start();
//            log.info("made a kid");
//            threadSafeCounter.increment();
//        }
//
//        }


}

