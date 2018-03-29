import java.nio.channels.SelectionKey;

public class Conductor extends Musician {
    private Boolean usesBaton;



    public Conductor(String name, Enum<Skill> skillLevel, Boolean usesBaton) {
        super(name, skillLevel);
        this.usesBaton = usesBaton;
    }

    public String applaud() {
        if (this.usesBaton){
            return "Tap Tap";
        } else {
            return "Clap Clap";
        }
    }

    public String rehearse(Score score) {
        return "Conducts " + score.getName() + " in broken stages.";
    }

    public String speak() {
        return "Tutti";
    }

    public String conducts() {
        if (this.usesBaton){
            return "Waves Baton";
        } else {
            return "Waves Hands";
        }
    }

}
