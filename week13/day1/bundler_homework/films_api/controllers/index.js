const express = require("express");
const router = new express.Router();

router.use("/films", require("./films"));

router.get("/", function (req, res) {
  res.json({data: "Index.js Router is Working for Home Route"});
});

module.exports = router;
