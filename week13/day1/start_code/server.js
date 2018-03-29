const express = require("express");
const app = express();

const cats = ["Bengal", "British Shorthair", "Siamese"];

app.get("/", function(req, res) {
  res.json({ data: "Sup!"});
});

// SHOW restful route
app.get("/cats/:id", function (req, res) {
  res.json({data: cats[req.params.id]});
});

app.listen(3000, function() {
  console.log("Cats app running on port " + this.address().port);
});
