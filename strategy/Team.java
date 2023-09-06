package strategy;
import java.util.ArrayList;
import java.util.Random;

/**
 * Holds the football
 */

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private boolean offense;
    private Random random;

    /**
     * Creates a team
     * @param teamName The string name of the team
     */
    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
        random = new Random();
        offense = random.nextBoolean();
    }

    /**
     * Adds team players to team
     * @param firstName player's first name
     * @param lastName player's last name
     * @param type player's position
     */
    public void addTeamMember(String firstName, String lastName, PlayerType type) {
        if (type.equals(PlayerType.QUARTER_BACK)) {
            players.add(new QuarterBack(firstName, lastName, offense));
        } else if (type.equals(PlayerType.RECEIVER)) {
            players.add(new Receiver(firstName, lastName, offense));
        } else if (type.equals(PlayerType.LINEMAN)) {
            players.add(new Lineman(firstName, lastName, offense));
        } else {
            System.out.println("Sorry, " + teamName + " wasn't added to the team.");
        }
    }

    /**
     * Creates turnover if offense is not offense
     */
    public void turnover() {
        offense = !offense;
        for (Player player : players) {
            player.turnover();
        }
    }

     /**
     * Creates Execute play and @return the player and their play
     */
    public void executePlay() {
        for (Player player : players) {
            System.out.println(player + " " + player.play());
        }
    }

     /**
      * 
      * @return array list of players
      */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * @return string representation of the team name
     */
    public String getName() {
        return teamName;
    }

    /**
     * 
     * if true @return offense 
     */
    public boolean onOffense() {
        return offense;
    }
}
