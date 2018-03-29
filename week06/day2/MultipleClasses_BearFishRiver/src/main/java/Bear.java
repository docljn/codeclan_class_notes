import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

//    use this.whatever where there is potential ambiguity
//    e.g. a local variable, and instance variable, and a property of a class
//    this.whatever means the property of the class

    public Bear(String name){
        this.name = name;
        this.belly = new ArrayList<>();
    }

    public int foodCount() {
        return this.belly.size();
    }


    public void eat(River river) {
        Salmon salmon = river.removeSalmon();
        this.belly.add(salmon);
    }

    public void sleep() {
        this.belly.clear();
    }
}