package com.alexbazlinton.topmovieslist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Set;

public class FavouritesActivity extends AppCompatActivity {

    // instance variable to refer to the textView on the layout
    TextView favourites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        // any actions to do with the shared preferences need to start as soon as the activity loads
        // getSharedPreferences(filekey stored as a string resource IN ALL CAPS, Context.enum)
        // this will create the file if it doesn't exist, and fetch it if it does
        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);



        // method asks for a default value in case the requested key does not exist, the default is not saved

        // we will be using a stringified arraylist to store information (using the gson java library) as a json object:
        // the default value must thus be ArrayListObject.toString()

        String favouriteMovies = sharedPreferences.getString("MyFavourite", new ArrayList<Movie>().toString());
        Log.d("Favourite movie", favouriteMovies);

        // create a GSON object to deal with the array/string conversion
        // give it a type token so that it knows what kind of object it is dealing with
        Gson gson = new Gson();
        TypeToken<ArrayList<Movie>> movieArrayListToken = new TypeToken<ArrayList<Movie>>(){};


        // Gson translates the Json object in shared preferences into an arraylist<Movies>
        ArrayList<Movie> myFavourites = gson.fromJson(favouriteMovies, movieArrayListToken.getType());




        // retrieve intent
        Intent intent = getIntent();
        // get the extra (the movie) back
        Movie selectedMovie = (Movie) intent.getSerializableExtra("movie");


        //in Java, add the selectedMovie to the arraylist you have created from the json object
        myFavourites.add(selectedMovie);


        String movieString = "";
        for(Movie movie: myFavourites){
            movieString += movie.getTitle() + "-" + movie.getYear() + "\n";
        }



        // set as soon as you check the current favourite in shared preferences file
        // access the textView object
        favourites = findViewById(R.id.favourites);
        // set the textView text to the movieString created from the movie objects created from json object
        favourites.setText(movieString);


        // add selectedMovie to the shared preferences file
        // CARE: shared preferences is used for returning data
        // CARE: a SharedPreferences.Editor is used for adding data

        // create editor, and "open" the data file
        SharedPreferences.Editor editor = sharedPreferences.edit();
        // add data: a json type?? (using gson) made from the myFavourites arraylist
        editor.putString("MyFavourite", gson.toJson(myFavourites));
        // save data
        editor.apply();


        // temporary text message pop up, auto disappear
        Toast.makeText(this, selectedMovie.getTitle() + " added.", Toast.LENGTH_LONG).show();
    }
}

// If you want to use JSON type stuff in your project, add the following to the build.grad (Module: app) file:
// compile 'com.google.code.gson:gson:2.3.1'
// as a dependency