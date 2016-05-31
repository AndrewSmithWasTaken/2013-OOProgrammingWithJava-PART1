
/**
 *
 * @author andrew
 */
public class Player {
    private String playerName;
    private int goals;

    public Player(String playerName, int goals) {
        this.playerName = playerName;
        this.goals = goals;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return playerName;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return playerName + ", goals " + goals;
    }
    
}
