const express = require('express');
const countriesRouter = express.Router();
const MongoClient = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017';

MongoClient.connect(url, function(err, client){
  const db = client.db('bucket_list_app');

  countriesRouter.get('/bucketList', function(req, res) {
    const collection = db.collection('bucket_countries');
    collection.find({}).toArray(function(err, docs) {
      res.json(docs);
    })
    console.log("countriesRouter.get");
  })


  countriesRouter.post('/bucketList', function(req, res) {
    const collection = db.collection('bucket_countries');
    collection.insert(req.body.country);
    console.log("countriesRouter.post" + JSON.stringify(req.body.country));
    res.status(200);
    res.send();
    console.log("countriesRouter.post");
  })

})


module.exports = countriesRouter;
