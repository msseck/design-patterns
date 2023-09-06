package strategy;

/**
 * OBlockBehavior for offense position
 * @author Marietou Seck
 */
class OBlockBehavior implements OffenseBehavior {

    /**
     * When Offense Behavior is in OBlock behavior
     * @return string representation of OBlock behavior play
     */
    public String play(){
        return ("block defenders");
    }
}