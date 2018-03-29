import java.util.ArrayList;

public class River {
    ArrayList<Salmon> salmons;

    public River(){
        this.salmons = new ArrayList<>();
    }


    public void addSalmon(Salmon salmon) {
        this.salmons.add(salmon);
    }

    public int getSalmonCount() {
        return this.salmons.size();
    }

    public Salmon removeSalmon() {
        return this.salmons.remove(0);
    }
}
