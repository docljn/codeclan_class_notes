var myName = "Lorna";
if(myName === "Lorna"){
  console.log("Hi " + myName + " wake up!");
} else {
  console.log("Who?");
}



var counter = "one";

if (counter > 0){
  console.log("The counter is greater than 0");
} else if(counter < 0) {
  console.log("The counter is less than 0");
} else {
  console.log("The counter is equal to 0, or not a number");
}


// one line if:
var counter = -1;
if (counter === -1) console.log("Aha!");

// switch statements: AWFUL AWFUL AWFUL!
var pet = "cat";
switch(pet){
  case "cat":
    console.log("cats are awful");
    break;
  case "dog":
    console.log("who let the dogs out");
    break
  default:
    console.log("no pet");
}

// NB: Try this instead:
// https://toddmotto.com/deprecating-the-switch-statement-for-object-literals/

function petQuote (pet) {
  var petQuotes = {
    'cat': "cats are awful",
    'dog': "who let the dogs out",
    'default': "no pet"
  }
  return (petQuotes[pet] || petQuotes['default'])
}
console.log(petQuote('dog'));

// this version returns undefined if the pet isn't a declared type
function getPetQuote (pet) {
  return {
    'cat': "cats are awful",
    'dog': "who let the dogs out",
  }[pet];
}
console.log(getPetQuote('tortoise'));

// ternary

console.log(1 + 1 === 2 ? "maths" : "maths doesn't work");

var equation = 1 + 1 === 2 ? "maths" : "maths doesn't work";
console.log(equation);
