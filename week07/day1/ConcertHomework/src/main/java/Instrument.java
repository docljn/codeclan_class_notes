public abstract class Instrument implements ITune {

    String name;

    public Instrument(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
