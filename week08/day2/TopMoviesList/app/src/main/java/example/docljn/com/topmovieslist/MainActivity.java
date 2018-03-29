package example.docljn.com.topmovieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add some data to use initially: hardcoded array:
        //String[] data = {"one", "two", "three"};  // string array shorthand

        // to get an ArrayList of Movie class instances, we new up an instance of the TopMovies class and call getMovies;
        ArrayList<Movie> data = new TopMovies().getList();


        /*
        // find a way to access the name of each movie - this is ONE way, setting a default "to String" method on the Movie would also do this
        // movie.getTitle(); returns a string
        ArrayList<String>data = new ArrayList<>();
        for (Movie movie: movies) {
        data.add(movie.getTitle());
        }
        */

        /*
        initially we use a generic array adapter new ArrayAdapter<T>(context, layout for each row of the listview, data_source)
        Initial version: ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.title, data);
        Second version: ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<>(this, R.layout.title, data);
        */



        // an ArrayAdapter iterates through the list given, and calls "toString" on each item in the list
        // CARE: if you set an override toString() method in the Movies class, then this will return whatever that was set to return

            //  eventually we will create a custom adapter which will give you control over what you display....

        // create a new list view object:
        ListView listView = findViewById(R.id.list_view);

        // connect listview to arrayadapter:
        // Initial version: listView.setAdapter(arrayAdapter);

        //Create new topMoviesAdapter:
        TopMoviesAdapter moviesAdapter = new TopMoviesAdapter(this, data);
        listView.setAdapter(moviesAdapter);


        }

    }
