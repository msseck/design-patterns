package strategy;

/**
 *  A Football Player
 * @author Marietou Seck 
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    /**
     * Creates a String representation for Player's name
     * @param firstName Player's first name
     * @param lastName Player's last name
     * @param offense Player's offense position
     */
    public Player(String firstName, String lastName, boolean offense) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.offense=offense;
        setDefenseBehavior();
        setOffenseBehavior();

    }

    /**
     * setDefense behavior returns nothing
     */
    public abstract void setDefenseBehavior();

    /**
     * setOffenseBehavior returns nothing
     */
    public abstract void setOffenseBehavior();

    /**
     * String representation of what position the player is playing and if they're playing
     * @return the offense play, else if defense play or else not playing for the player
     */
    public String play(){
        
        if(offense && offenseBehavior != null){

            return offenseBehavior.play();
        }
        else if(!offense && defenseBehavior != null){

            return defenseBehavior.play();
        }
        return "not playing";
    }

    /**
     * Turnover is offense is not equal to offense
     */
    public void turnover(){
        offense = !offense;
    }

    /**
     *  String representation of the players first and last name
     */
    public String toString(){
        return this.firstName + " " + this.lastName;
    }



}