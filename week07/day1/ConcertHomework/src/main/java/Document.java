public abstract class Document {

    String name;
    double price;

    public Document(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
