import java.util.ArrayList;

public class Orchestra implements IPlay {

    String name;
    ArrayList<Player> players;
    Conductor conductor;
    ArrayList<Score> programme;

    public Orchestra(String name, ArrayList<Player> players, Conductor conductor, ArrayList<Score> programme){
        this.name = name;
        this.players = new ArrayList<>();
        this.conductor = conductor;
        this.programme = new ArrayList<>();

    }

//    public String rehearse(Score score) {
//        return ;
//    }
}
