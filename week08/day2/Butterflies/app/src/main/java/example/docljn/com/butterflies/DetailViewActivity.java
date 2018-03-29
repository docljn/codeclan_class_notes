package example.docljn.com.butterflies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        // Create a new Intent which will be the same as the intent that was sent by startActivity on the source activity
        // There will only ever be one intent
        Intent intent = getIntent();
        // Cast the extra, which is an object, to be a Butterfly
        Butterfly butterfly = (Butterfly)intent.getSerializableExtra("butterfly");
        // TODO: Check that the object has been passed and cast correctly: this won't work yet....WHY?
        Log.d("Detail View", butterfly.getLatinName());

        ImageView imageView = findViewById(R.id.imageViewLarge);
        imageView.setImageResource(butterfly.getImageID());

        TextView commonName = findViewById(R.id.common_name);
        commonName.setText(butterfly.getCommonName());

//        TextView latinName = findViewById(R.id.latin_name);
//        latinName.setText(butterfly.getLatinName());


    }
}

