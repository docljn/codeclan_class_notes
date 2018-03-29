// mongo manual
// https://docs.mongodb.com/manual/mongo/

// collection methods:
// https://docs.mongodb.com/manual/reference/method/js-collection/

// mongo database commands
use farm;
db.dropDatabase(); // clears everything out of the farm database

db.animals.insert(
  {
    name: "Frank",
    type: "Polar Bear"
  }
);


db.animals.insert(
  {
    name: "Velvet",
    type: "Mole"
  }
);


  db.animals.insert(
  {
    name: "Silk",
    type: "Ferret"
  }
);


// .pretty() means the terminal display is one line per argument
db.animals.find().pretty();


// update(thing_to_find, update_to_make[, optional_args]);
db.animals.update(
  {name: "Velvet"},
  {$set: {type: "Spy"}}
);
db.animals.find({name: "Velvet"});


db.animals.remove({
  name: "Frank"
});
db.animals.find().pretty();


show dbs;

use food;
db.dropDatabase();
show dbs;
