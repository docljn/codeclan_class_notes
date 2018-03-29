// in JS, a hash {key: value} is called an object
// functions in JS are "first class objects"
// a function can be put in a hash as a value

// NB: https://toddmotto.com/deprecating-the-switch-statement-for-object-literals/

// although the key is declared as key: it is actually "key"

// no need to create a class before you create an object:
// myPerson *is* an object in JS

var myPerson = {
  name: "Guybrush",
  age: 32,
  weapon: "cutlass",
  talk: function(){
    return "Shiver me timbers, my name is " + this.name;
  }
}



console.log("My person:", myPerson);
console.log(typeof myPerson);

// if we use a constructor, the type will be whatever class you specified

// changing a property:
myPerson.name = "Guybrush Threepwood";

// accessing any property: Three ways...
console.log(myPerson.name);
console.log(myPerson["name"]);

const checker = "name"
console.log(myPerson[checker]);


// adding a new property:
myPerson.occupation = "pirate";
console.log("My person:", myPerson);


// CARE: functions can be added and invoked in the same way
console.log(myPerson.talk());


// Get all the keys on a given object as an array:
console.log(Object.keys(myPerson));



// creating objects
const object = {}

const anotherObject = Object.create(null);

const yetAnotherObject = new Object();

console.log(object, anotherObject, yetAnotherObject);




const bear = {
  type: "Grizzly",
  name: "Growler",
  belly: new Array(),
  eat: function(food){
    this.belly.push(food);
  }

}
console.log("Belly before eating:", bear.belly);
bear.eat("salmon");
console.log("Belly after eating:",bear.belly);

//square bracket syntax means we can loop through keys without knowing what they are:
const keys = Object.keys(bear);
for (key of keys) {
  console.log('key:', key, 'value:', bear[key]);
}
