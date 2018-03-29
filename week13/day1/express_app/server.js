const express = require("express");
// not a constructor, but express() returns a function which can be used as a server
const app = express();

// common usage (req, res) = (request, response)
// execute the callback when a GET request is made to the home route
// once the server is running, changes are not automatically picked up UNLESS you restart the server.
//HOWEVER: you can globally install a package to fix this:
// "npm install nodemon -g"
// then RESTART the server using "nodemon server.js"
// it watches for saves, and restarts the server automatically

//NB: If you are working on the server.js file, always start with nodemon
//NB: You can alias "npm start" in the package.json to use nodemon:
//   "scripts:" {"start": "nodemon server.js"}
// NB: DOCS: https://github.com/remy/nodemon#nodemon

// app.get("/", function (req, res) {
//   res.json({data: "Hello World!"});
// });

//NB: __dirname is the path to the current file directory containing the express server

app.get("/", function (req, res) {
  // console.log(__dirname);
  res.sendFile(__dirname + "/index.html");
});

// NB: we have to tell the server where the public files e.g. .css are found.

app.use(express.static("public"));

app.listen(3000, function () {
  console.log("app is running on port " + this.address().port);
  // this is the app variable
});
