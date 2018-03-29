package example.docljn.com.butterflies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ButterflyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly_list_activity);

        ArrayList<Butterfly> data = new ButterflyList().getList();

        ListView listView = findViewById(R.id.list_view);


        ButterflyAdapter butterflyAdapter = new ButterflyAdapter(this, data);
        listView.setAdapter(butterflyAdapter);



    }

    // Create an onClick method in your source activity:
    // Check to see if onClick can access the tag which you added to the listViewItem in ButterflyListActivity:
//    public void onListItemClick(View listItem) {
//        Butterfly butterfly = (Butterfly) listItem.getTag();
//        Log.d("Butterfly Name", butterfly.getCommonName());
//        // first you  need to add this action to your view i.e. open display_row.xml,
//        // DON'T click on any components, but on the empty space to select the entire row item
//        // set the onClick event to be onListItemClick
//        // Test: run the app and click on a single row in your list view, then open 6: Logcat and look for the name.
//    }


    // Use the tag which was set on the current butterfly in the ButterflyAdaptor:
    // Create a method in your source activity to attach the current butterfly to a newly created intent
    // this intent will be passed, via the Android OS, to the target activity, via startActivity(intent)
    public void getButterfly(View listItem) {
        Butterfly butterfly = (Butterfly) listItem.getTag();
        Log.d("Intent creation", butterfly.getCommonName());

        Intent intent = new Intent(this, DetailViewActivity.class); //NEW
        // CARE: .class is called on the target activity
        intent.putExtra("butterfly", butterfly); //NEW
        // TODO: think about attaching only the data you will use, rather than the whole object
        startActivity(intent); //NEW

        // move to the target activity here and retrieve the extra...
    }
}
