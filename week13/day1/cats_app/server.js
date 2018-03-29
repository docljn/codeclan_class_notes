const express = require("express");
const app = express();

const bodyParser = require("body-parser");
// for json in the request body
app.use(bodyParser.json());
// for forms and queries, usually, for data sent in the request URL
app.use(bodyParser.urlencoded({extended: true}));

// find all your routes in...
app.use(require("./controllers/index"));


// this starts the server:
app.listen(3000, function() {
  console.log("Cats app running on port " + this.address().port);
});


// NB: INSOMNIA is a debugger for post/put/delete requests [cmd space insomnia]
