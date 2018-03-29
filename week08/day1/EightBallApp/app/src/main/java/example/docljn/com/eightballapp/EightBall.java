package example.docljn.com.eightballapp;

import java.util.ArrayList;
import java.util.Collections;

import example.docljn.com.eightballapp.Answer;

/**
 * Created by allymcgilloway on 12/12/2017.
 */

public class EightBall {
    Answer answers;

    public EightBall(Answer answers){
        this.answers = answers;
    }

    public String randomAnswer(){
        return answers.getRandomAnswer();

    }

}
