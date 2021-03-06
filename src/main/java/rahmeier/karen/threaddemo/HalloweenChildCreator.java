package rahmeier.karen.threaddemo;

import org.apache.log4j.Logger;

/**
 * Object that determines the rules of behavior for opening the door to hand out halloween candy
 * <p>
 * <p>
 * Scenario: Riley is responsible for handing out candy on Halloween while Jen takes their kids trick-or-treating.
 * Rather than waiting at the door with candy for the trick-or-treaters, Riley watches Halloween specials.
 * "It’s the Great Pumpkin, Charlie Brown" is a favorite. When a trick-or-treater rings the doorbell,
 * Riley answers the door and hands out candy. If there is a group of trick-or-treaters,
 * Riley continues giving out candy until all the kids are served, at which point tv-watching resumes.
 * It takes Riley 3 seconds to give candy to one child.
 * If there are more than 10 kids at Riley’s door, a trick or treater will bypass the house.
 * <p>
 * <p>
 * Created by karen.rahmeier on 11/3/2016.
 */
public class HalloweenChildCreator {
    private final Logger log = Logger.getLogger(this.getClass());

    public HalloweenChildCreator() {
    }

    public String createTrickOrTreater(int childNumber) {
        return new String("Child " + childNumber);
    }

    public boolean stopCreatingTrickOrTreatChildren(int numberOfChildrenWaiting) {
        if (numberOfChildrenWaiting >= 10) {
            return true;
        } else {
            return false;
        }
    }



}


