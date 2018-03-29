public class Player extends Musician implements IPractise, IPlay {

    private Instrument instrument;

    public Player(String name, Enum<Skill> skillLevel, Instrument instrument) {
        super(name, skillLevel);
        this.instrument = instrument;
    }

    public String applaud() {
        return "Claps hand on leg";
    }

    public String practise(Instrument instrument) {
        return "Repeats one phrase over and over on " + instrument.getName();
    }

    public String rehearse(Score score) {
        return "Plays " + score.getName() + " in broken stages, as directed by the conductor.";
    }

    public String speak() {
        return "Could I have an A please";
    }

    public String play(Score score) {
        return "Plays the " + instrument.getName() + " part in " + score.getName() + " from beginning to end";
    }
}
