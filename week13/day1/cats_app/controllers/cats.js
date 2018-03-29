const express = require("express");
const catRouter = new express.Router();

const cats = ["Bengal", "British Shorthair", "Siamese"];


//NB: put dynamic routes above static routes

// SHOW restful route
catRouter.get("/:id", function (req, res) {
  res.json({data: cats[req.params.id]});
});

// INDEX restful route
catRouter.get("/", function (req, res) {
  res.json({data: cats});
  // the format you return the data is up to the developer
});

// NEW: tbc

//NB: to do create/update we need a package:  > npm install --save body-parser

// CREATE restful route
catRouter.post("/", function (req, res) {
  cats.push(req.body.cat);
  res.json({data: cats});
});

// UPDATE restful route
catRouter.put("/:id", function (req, res) {
  cats[req.params.id] = req.body.cat;
  res.json({data: cats});
});


// DELETE restful route
catRouter.delete("/:id", function (req, res) {
  cats.splice(req.params.id, 1);
  res.json({data: cats});
});

module.exports = catRouter;
