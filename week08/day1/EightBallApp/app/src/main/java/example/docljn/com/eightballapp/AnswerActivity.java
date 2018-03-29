package example.docljn.com.eightballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answertext = findViewById(R.id.answer_text);

        //  I don't want to create a new EightBall here - the information is already in the EightBallActivity.
        //  All I need is a single string: the answer - which I can put on the intent as a package


        // To get information from intent:
        // there can only be one intent, as the intent is what starts the activity
        Intent intent = getIntent();
        // intent carries information as extras in a Bundle datatype
        Bundle extras = intent.getExtras();
        // the bundle behaves like a hashmap
        String answer = extras.getString("answer");
        // set the text to display
        answertext.setText(answer);


        Log.d(getClass().toString(), "onCreate is called in answertext");

    }
}
