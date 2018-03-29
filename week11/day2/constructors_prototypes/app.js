const Pet = require("./pet.js");
const Person = require("./person.js");

const scooby = new Pet("Scooby Doo", "Dog");

scooby.eat("Scooby snack");

const shaggy = new Person("Shaggy Rogers", scooby);
shaggy.greet();

shaggy.feedPet("Scooby Snack");

//
// Task:
//
// Assign a pet property in the Person constructor via a parameter
// Add a feedPet method to Person.prototype which:
// Accepts a food parameter
// Outputs a string containing the person and pet's names and the food. For example: 'Shaggy Rogers fed Scooby Doo a Scooby Snack'
// Invokes the pet's eat method and passes the food to it


// reference for ESLinter config: https://eslint.org/docs/user-guide/configuring
// and another: http://www.codeblocq.com/2016/03/Setup-ESLint-in-Atom/


// TODO: CARE:
// a way to stop objects from being able to have new attributes created for it outside the constructor: Object.preventExtensions(object_you_wish_to_secure);
// if in place of object_you_wish_to_secure, you write this in the constructor it will work
// as in: Object.preventExtensions(this);
