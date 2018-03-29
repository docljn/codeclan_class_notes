public class Score extends Document {

    String genre;

    public Score(String name, double price, String genre) {
        super(name, price);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
