const express = require("express");
const router = express.Router();
const path = require("path");

// router.use("/api/bucket", require("./bucket_controller"));
// this will eventually route all queries other than the home/index/about through a secondary controller

router.get("/", function (req, res) {
  console.log(res.sendFile(path.join(__dirname + "/../client/build/index.html")));
});


module.exports = router;
