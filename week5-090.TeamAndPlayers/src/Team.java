import java.util.ArrayList;
/**
 *
 * @author andrew
 */
public class Team {
    private String name;
    private ArrayList<Player> squad;
    private int squadMaxSize;

    public Team(String name) {
        this.name = name;
        this.squad = new ArrayList<Player>();
        this.squadMaxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player playerName) {
        if (this.size() >= squadMaxSize) {
            return;
        }
        squad.add(playerName);
    } 
    
    public void printPlayers() {
        for (Player p : squad) {
            //System.out.println(p.getName() + ", goals " + p.goals());
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int maxSize) {
        squadMaxSize = maxSize;
    }
    
    public int size() {
        return squad.size();
    }
    
    public int goals() {
        int tg = 0;
        for (Player p : squad) {
            tg += p.goals();
        }
        return tg;
    }
}
