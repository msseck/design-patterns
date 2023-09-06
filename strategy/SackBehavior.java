package strategy;

/**
 * SackBehavior for defense position
 * @author Marietou Seck
 */
class SackBehavior implements DefenseBehavior {

    /**
     * When Defense Behavior is in Sack behavior
     * @return string representation of Sack behavior play
     */
    public String play(){
        return ( "sack the quarterback");
    }
}