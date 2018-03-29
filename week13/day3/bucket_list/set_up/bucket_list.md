## Bucket List

Create an application to make a 'bucket list' of countries you want to visit:

- Use the rest countries API to get the countries of the world.
  - set up a basic server.js with a get request to index.html
  - consider using a Request prototype for the server interactions to streamline things?
  - set up a basic app.js inside /src to fetch the restcountries data from the api
  - TODO: call the app from somewhere?
  - set up an index.html file
    - **remember to add <script src="bundle.js">**
    - a dropdown to select a country
    - a button to add the country to the bucket list
    - a button to delete the whole bucket list
    - the actual bucket list displayed
    - a way to delete a single country from the bucket list

#### Note: CRUD requires both database and browser operations

- Add countries to a bucket list.
  - will need a model / models and view / views
- Persist this list using Mongo.
  - needs a database, collection, documents
  - needs CRUD actions inside the models

- Try to split your client code into models and views. Think about the responsibilities of each.


Possible extensions:

- Add a Google Map with markers for countries on the bucket list
- Add more detail to the bucket list items - e.g. landmarks you want to visit or the season you want to visit in. Persist these to Mongo too.
- Style the app
