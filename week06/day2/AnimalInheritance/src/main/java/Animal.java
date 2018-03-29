public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String eat() {
        return "Crunch Munch";
    }

    public String breathe() {
        return "Gasp Wheeze";
    }
}
