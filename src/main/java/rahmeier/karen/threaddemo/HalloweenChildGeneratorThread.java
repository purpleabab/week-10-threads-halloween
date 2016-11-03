package rahmeier.karen.threaddemo;

import org.apache.log4j.Logger;

/**
 * This thread creates new trick-or-treating children
 * <p>
 * This thread is interrupted when the max number of children waiting is reached.
 * <p>
 * Created by karen.rahmeier on 11/3/2016.
 */
public class HalloweenChildGeneratorThread {
    private final Logger logger = Logger.getLogger(this.getClass());

    public void run() {
        logger.info("In HalloweenChildGeneratorThread.run");
    }
}
