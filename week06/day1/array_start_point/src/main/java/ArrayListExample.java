//  arrays can hold primitive types, arraylists cannot
//  each primitive has an associated reference type, but they have to be created as classes

import java.util.ArrayList;

public class ArrayListExample {

    private ArrayList<String> words;
//    can specify data type in constructor OR in variable declaration (not both!)

    public ArrayListExample(){
        this.words = new ArrayList<>();
//        syntax requires the <> and () when creating a new ArrayList
    }

    public int getWordCount() {
        return this.words.size();
    }


    public void addWord(String word) {
        this.words.add(word);
    }

    public String getWordAtIndex(int index) {
        return this.words.get(index);
    }
}
