package example.docljn.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText phraseEditText;
    Button countButton;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        // auto generated up to this point...

        phraseEditText = findViewById(R.id.phraseEntry);
        countButton = findViewById(R.id.countButton);
        result = findViewById(R.id.wordCountOutput);

        Log.d(getClass().toString(), "On Create Called");
    }

    public void onCountButtonClick(View button){
        String phrase = phraseEditText.getText().toString();
        Counter counter = new Counter();
        String totalCount = counter.getWordCount(phrase);
        String count = counter.outputWordsOccurrence(phrase);

        result.setText("Results \n" + count + "\n" + "Total word count: " + totalCount);

        Log.d("OnCountButtonClick: " + phrase, getClass().toString());
    }
}
