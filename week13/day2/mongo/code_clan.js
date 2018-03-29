use codeclan;
db.dropDatabase();

db.students.insert([
  {
    name: "Robert",
    favouriteFood: "Pizza"
  },
  {
    name: "Vishal",
    favouriteFood: "Checken Sweetcorn Pasta x 6"
  }

]);

db.students.find().pretty();

db.instructors.insert([
  {
    name: "Zsolt",
    favouriteFood: "Lasagna"
  },
  {
    name: "Colin",
    favouriteFood: "knowledge"
  }
]);
db.instructors.find().pretty();

show collections;
