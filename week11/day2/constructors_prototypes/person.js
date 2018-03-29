const Person = function(name, pet){
  this.name = name;
  this.pet = pet;
};


// create a prototype object where all the methods are stored, and have instances inherit.

Person.prototype.greet = function(){
  console.log(`Hi my name is ${this.name}`);
};

Person.prototype.feedPet = function(food){
  console.log(`${this.name} fed ${this.pet.name} a(n) ${food}`);
  this.pet.eat(food);
};

// TODO: CARE: you have to export the information you want to be able to import

module.exports = Person;

// Name is capitalised by convention in a constructor function
// It is still just a function
//
// const shaggy1 = Person();
// console.log('shaggy:', shaggy1);
// // => undefined: invoking a function with no return value
//
// const shaggy = new Person("Shaggy");
// console.log('shaggy:', shaggy);
// // => Person {}   i.e. a Person object
// // no longer writing an Object literal, the keyword new creates a new Person object where invoking the function just gives the return value of the function
// // CARE: if the constructor function has an explicit return, it isn't a constructor function any more!
//
// // Add a name property with the value 'Shaggy Rogers' to the object that is returned from our constructor
// // console.log only shaggy's name property instead of the entire object
//
// shaggy.name = "Shaggy Rogers";
// console.log(shaggy.name);
// shaggy.greet();

// REFERENCE: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/constructor

// const velma = new Person ("Velma Dinkley");
// velma.greet();
