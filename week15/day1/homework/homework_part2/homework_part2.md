# React IMDB Homework

## Reading

Thinking In React (20 mins) https://facebook.github.io/react/docs/thinking-in-react.html

## Practice

Here's a component from IMDB showing opening movies this week.

![IMDB UK Opening This Week](imdb-opening-this-week.png)


- Draw out the skeleton of this app on paper.
- Write down the names of the components and whether they have state or props.

## Component Skeleton

- FilteredViewContainer: (state: data=entireMovieCollection filtered to this week, titleOfContainer)
  - TitleBarComponent: UK Opening This Week (doesn't change unless you want to use this for any other filtered view: props=name)
  - FilteredViewItemListComponent(props: data=FilteredMovies)
    - ItemDataComponent (this would depend on whether you were re-rendering the whole list, or if you just changed the information displayed in each box)
      - BookmarkImageAndLink (props: comes from entireMovieCollection)
      - MovieTitleAndLink (props: comes from entireMovieCollection)
      - ShowtimesLink (props: comes from entireMovieCollection)
    - ShowMoreLink (just takes to full list so no need for state or props!)
  - ActionBar
    - GetShowtimesActionButton (no idea what this is supposed to do, so no idea what info it needs!)
