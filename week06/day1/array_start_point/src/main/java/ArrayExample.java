//  arrays can hold primitive types, arraylists cannot

public class ArrayExample {

    private String[] words;

    public ArrayExample(){
        this.words = new String[5];
    }

    public void add(String word) {
        this.words[0] = word;
    }

    public int getWordCount() {
        return this.words.length;
//        length is NOT a method, it is a PROPERTY
//        length returns an int with the number of items in the array
    }
}
