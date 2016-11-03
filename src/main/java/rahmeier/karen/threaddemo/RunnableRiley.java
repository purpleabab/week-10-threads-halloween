package rahmeier.karen.threaddemo;

import org.apache.log4j.Logger;

/**
 * This thread watches television until a trick-or-treater rings the doorbell.
 * <p>
 * This thread is interrupted when children appear at the door and sleeps when there are none waiting.
 * <p>
 * Created by karen.rahmeier on 11/3/2016.
 */
public class RunnableRiley implements Runnable {
    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        logger.info("in RunnableRiley.run");
    }
}
