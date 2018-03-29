// everything comes together in index.js
//  all the sub-routers
//  index, about, contact etc
// server.js serves up everything from index.js

const express = require("express");
const router = new express.Router();

// prefix any route from cats.js with /cats
router.use("/cats", require("./cats"));

// HOME route
router.get("/", function(req, res) {
  res.json({ data: "Meow!"});
});


module.exports = router;
