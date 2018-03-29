package example.docljn.com.eightballapp;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by allymcgilloway on 12/12/2017.
 */

public class Answer {
    ArrayList<String> answers;

    public Answer(){
        setUpAnswers();
    }

    public void setUpAnswers(){
        this.answers = new ArrayList();
        answers.add("Yes!");
        answers.add("No!");
        answers.add("Quite possibly...");
        answers.add("Signs are tending to the negative.");
        answers.add("Affirmative");
        answers.add("I will need to consult my sources.");
        answers.add("Absolutely!");
        answers.add("That would be an ecumenical matter!");
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<>(this.answers);
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
        return this.answers.get(0);
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }
}
