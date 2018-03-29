## Add an onclick

Welcome, brave traveller!

Let's say we want to be able to click on one of the rows to display more info about the movie on a new activity.

We want to be able to pass the WHOLE Movie object through to another activity. setTag() allows us to attach an object to a view. We are going to set the object as a tag on the list item in the ArrayAdapter.

```java
// TopMoviesAdapter

    TextView year = (TextView) listItemView.findViewById(R.id.year);
    year.setText(currentMovie.getYear().toString());

    listItemView.setTag(currentMovie); //UPDATED

    return listItemView;
}

```

And then we can use the ```getTag()``` method to retreive it. We will check it by logging out the title:

```java
//TopMoviesActivity

public void onListItemClick(View listItem) {
        Movie movie = (Movie) listItem.getTag();
        Log.d("Movie Title: ", movie.getTitle());
    }

```

Now let's assign that method to the onclick of the list row. In `movies_item.xml` select the `ConstraintLayout` from the component tree and set the onClick property to be `onListItemClick()`



## Pass the Movie object to new Activity

You could now use this to create an intent that takes you to more details about the individual film. Let's do that.


First create a new MovieActivity for the individual film details to be displayed.

```
Right click App
New > Activity > EmptyActivity

Acitivity Name: MovieActivity
Layout Name: activity_movie

```

Previously we have passed strings as extras on intents, but now we are passing a Movie object. In order to do this we have to make our Movie class implement the Serializable interface so that it can be passed to the `putExtra()` method.

```java
//Movie

public class Movie implements Serializable {
...
}

```

Ok, let's pass that through on an intent.

```java
//TopMoviesActivity

public void getMovie(View listItem) {
        Movie movie = (Movie) listItem.getTag();
        Log.d("Movie Title: ", movie.getTitle());

        Intent intent = new Intent(this, MovieActivity.class); //NEW
        intent.putExtra("movie", movie); //NEW
        startActivity(intent); //NEW
    }

```

And when we get that intent back in MovieActivity we need to cast it from a Serializable back into Movie. We can log out the title to see we got it on the other side.

```java
//MovieActivity

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Intent intent = getIntent();
        Movie movie = (Movie)intent.getSerlizableExtra("movie");
        Log.d("MovieActivity: ", movie.getTitle());
    }

```
