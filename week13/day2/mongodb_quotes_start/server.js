const express = require("express");
const parser = require("body-parser");
const server = express();
const MongoClient = require("mongodb").MongoClient;
const ObjectID = require("mongodb").ObjectID; // turns ID into string

server.use(parser.json());
server.use(express.static("client/build"));
server.use(parser.urlencoded({extended: true}));

// make a mongodb connection on the port that mongod is running
// The entire controller is then wrapped in the mongodb connection
MongoClient.connect("mongodb://localhost:27017", function (err, client) {
  if (err) {
    console.log(err);
    return;
  }
  const db = client.db("star_wars");
  console.log("Connected to database");



  // POST REQUEST
  // CREATE
  server.post("/api/quotes", function (req, res) {
    const quotesCollection = db.collection("quotes");
    const quoteToSave = req.body;  // we will mimic this in Insomnia, as we don't have a way to generate a payload on the request body from the client side yet
    quotesCollection.save(quoteToSave, function (err, result) {
      // res is the response from the server (express): read by the client
      // result is what mongodb (database) sends back
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(201); // server status
      res.json(result.ops[0]);
      console.log("Saved to database");
    });
  });

  // GET REQUEST
  // INDEX
  server.get("/api/quotes", function (req, res) {
    const quotesCollection = db.collection("quotes");
    // find() with no arguments returns the whole collection
    quotesCollection.find().toArray(function (err, allQuotes) {
      if (err) {
        console.log(err);
        res.status(500);
        res.send();  // send res to user ie frontend
      }
      res.json(allQuotes);
      // returns every item in the quotes collection in the mongodb as an array of javascript objects, converted from mongo cursor object: all we want is the documents, and this is how we get them.

    });
  });

  // DELETE REQUEST
  // DELETE ALL [add an object into the filter object to delete one]
  server.delete("/api/quotes", function (req, res) {
    const quotesCollection = db.collection("quotes");
    // deleteMany(filterObject, callback)
    const filterObject = {};
    quotesCollection.deleteMany(filterObject, function (err, result) {
      console.log(result);
      
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(204);
      res.send();
    });
  });

  // DELETE REQUEST
  // DELETE ONE
  server.delete("/api/quotes/:id", function (req, res) {
    const quotesCollection = db.collection("quotes");
    // deleteMany(filterObject, callback)
    const objectID = ObjectID(req.params.id);
    const filterObject = {_id: objectID};
    quotesCollection.deleteMany(filterObject, function (err, result) {
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }
      res.status(204);
      res.send();
    });
  });


  // PUT REQUEST
  // UPDATE
  server.put("/api/quotes/:id", function (req, res) {
    const quotesCollection = db.collection("quotes");
    // NB: mongodb saves the id as an ObjectId NOT a string
    const objectID = ObjectID(req.params.id);
    const filterObject = {_id: objectID};
    const updatedData = req.body;
    // update(filterObject, newData, callback)
    quotesCollection.update(filterObject, updatedData, function (err, result) {
      if (err) {
        console.log(err);
        res.status(500);
        res.send();
      }
      res.send();
    });
  });




  server.listen(3000, function(){
    console.log("Listening on port 3000");
  });
});
