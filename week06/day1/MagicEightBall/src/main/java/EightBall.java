import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;


    public EightBall(){
        this.answers = new ArrayList<>();
        answers.add("Perhaps...");
        answers.add("It could be.");
        answers.add("Most decidedly so!");
    }

    public String getAnswer(){
        Collections.shuffle(answers);
        return this.answers.get(0);
    }


    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    public void addAnswer(String newAnswer) {
        this.answers.add(newAnswer);
    }

    public void deleteAnswer(String answer) {
        this.answers.remove(answer);
    }
}
