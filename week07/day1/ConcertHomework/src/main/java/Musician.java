public abstract class Musician extends Person implements IRehearse {

    Enum<Skill> skillLevel;

    public Musician(String name, Enum<Skill> skillLevel) {
        super(name);
        this.skillLevel = skillLevel;
    }

    public Enum<Skill> getSkillLevel() {
        return this.skillLevel;
    }


    public void setSkillLevel(Enum<Skill> skillLevel) {
        this.skillLevel = skillLevel;
    }
}
