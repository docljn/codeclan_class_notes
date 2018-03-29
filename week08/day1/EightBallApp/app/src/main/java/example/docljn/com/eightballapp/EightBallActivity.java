package example.docljn.com.eightballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

    //  create an instance variable for each of the widgets we are using:
    //  all widgets inherit from a superclass called View
    EditText questionEditText;
    Button shakeButton;
    // TextView answerText; removed when second activity screen added



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball);  // resources > layout > file name

    //  after setting content view (which sets up the xml file) you have access to the widgets
        questionEditText = findViewById(R.id.question);
        shakeButton = findViewById(R.id.shakeButton);
        // answerText = findViewById(R.id.answer); removed when second activity screen added
        // Inherited method from 'Activity': refer to id by name given in xml file which returns an int

//        Log.d(getClass().toString(), "OnCreate called");  // get the name of the activity you are in, as a string; then message to output
    }

    public void onShakeButtonClick(View button){
        // android inherited method requires a View object passed in: whatever is clicked will pass in a reference to itself
        String question = questionEditText.getText().toString();
        EightBall eightBall = new EightBall(new Answer());
        // could also have created an instance variable, and instantiated as part of onCreate
        // although, if you only need the eightBall if you click the button, you might be better to instantiate it only here


        Log.d(getClass().toString(), "The question asked was: " + question);


        //answerText.setText(eightBall.randomAnswer());  // need to start a new activity to move this to a new screen in the app
        // 1. create a new intent
        //   new Intent(context - where it comes from, class - name of the activity we want to start)
        //   "this" keyword tells you where you currently are in the program - the namespace?
        Intent intent = new Intent(this, AnswerActivity.class);

        // 2. add the information you want to pass as an "extra"
        //    intent.putExtra("String name of key", value - in this case a string)
        intent.putExtra("answer", eightBall.randomAnswer());

        //2. start activity using intent
        startActivity(intent);

    }
}
