package example.docljn.com.topmovieslist;

import android.content.Context;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class TopMoviesAdapter extends ArrayAdapter<Movie> {

    public TopMoviesAdapter(Context context, ArrayList<Movie> movies){
        super(context, 0,  movies);
        // resource is 0 because reasons GAH!!!!!!!!!!!!!!!
        //TODO: find out why!!!!!!!!!!!!
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        // TODO: CARE: NB FOR CODE TESTS
        // you don't want to create a view row for each element - just enough to display the screen plus one or two
        // if you did, you are likely to run out of memory, so this recycles the memory that is being used as you scroll
        if (listItemView == null){
            // i.e. if the view you need doesn't exist, create it as follows...
            // .inflate() changes xml into something that is visible
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_display_row, parent, false);
        }


        // getItem() is a method inherited from ArrayAdapter,
        // can use it to fetch an item matching the position which the view is currently preparing to display
        Movie currentMovie = getItem(position);

        //.findViewById() can only be called on a View
        // 1. set ranking text
        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentMovie.getRanking().toString());
        // 2. set title text
        TextView movie_title = listItemView.findViewById(R.id.movie_title);
        movie_title.setText(currentMovie.getTitle().toString());
        // 3. set year text
        TextView year = listItemView.findViewById(R.id.year);
        year.setText(currentMovie.getYear().toString());



        return listItemView;
    }


}
