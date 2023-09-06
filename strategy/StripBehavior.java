package strategy;

/**
 * StripBehavior for defense position
 * @author Marietou Seck
 */
class StripBehavior implements DefenseBehavior {

    /**
     * When Defense Behavior is in Sack behavior
     * @return string representation of Sack behavior play
     */
    public String play(){
        return ("strip a ball from runners hands");
    }
}