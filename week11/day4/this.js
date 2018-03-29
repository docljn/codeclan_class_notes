// "this" inside a function
function add (number1, number2) {
  console.log("This == global is:", this == global);
  this.myNumber = 20;  // in this context, this is the global
  return number1 + number2;
}

const result = add(5,3);

console.log(result);
console.log("myNumber is on the global function: ", global.myNumber);


// "this" inside an object literal
const car = {
  speed: 0,
  accelerate: function () {
    this.speed += 10;
    console.log("'this' inside a function inside a car object literal: ", this);

  }
};

car.accelerate();

// "this" inside a constructor function aka a JavaScript class
function Animal(type, numberOfLegs){
  this.type = type;
  this.numberOfLegs = numberOfLegs;
  // every animal will have its own copy of this function, where if it is on the prototype then there is a single function stored
  // the function is not called at instantiation, but rather declared
  this.logInfo = function () {
    console.log("The", this.type, "has", this.numberOfLegs, "legs.");
  };
}

const cat = new Animal("cat", 3);
cat.logInfo();


function AnimalOdd(type, numberOfLegs){
  this.type = type;
  this.numberOfLegs = numberOfLegs;
  // every animal will have its own copy of this function, where if it is on the prototype then there is a single function stored
  // the function is called directly at instantiation
  console.log("The", this.type, "has", this.numberOfLegs, "legs.");
}

const caterpillar = new AnimalOdd("caterpillar", 20);
