const express = require("express");
// const bodyParser = require("body-parser");
const app = express();

// app.use(bodyParser.json());
// app.use(bodyParser.urlencoded({extended: true}));

// NB: format of .get request is app.get(path, callback)

const path = require("path");

// __dirname is directory that contains this JavaScript source code file

app.get("/", function (req, res) {
  res.sendFile(path.join(__dirname + "/client/build/index.html"));
});

app.use(express.static("client/build"));
// eventually move the app.get into another controller?
// will need to change the route for sendFile to be /../client..... app.use(require("./client/controllers/index_controller"));
// this is the route to the uber-controller



app.listen(3000, function () {
  console.log("App running on port " +this.address().port);
});
