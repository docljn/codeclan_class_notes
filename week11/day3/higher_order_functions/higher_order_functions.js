// parameters are output, delay_in_milliseconds
// setTimeout is responsible for invoking the function [a higher order function]
// although we call setTimeout before first and second, it invokes our function after the delay
// our function, the argument of the higher order function, is the callback
// CARE: things no longer happen in the order written

setTimeout(function() {
  console.log("I waited for half a second");
}, 500);

console.log("first");
console.log("second");


const logRed = function () {
  console.log("It's red!");
};

const logNotRed = function () {
  console.log("It's NOT red!");
};

const redChecker = function (colour, isRedFunction, isNotRedFunction) {
  if (colour.toLowerCase() == "red"){
    isRedFunction();
  } else {
    isNotRedFunction();
  }
};

// CARE: don't put brackets after the functions you are passing in, because you don't want to call/invoke them - that will be done inside the higher order function
redChecker("Red", logRed, logNotRed);
redChecker("blue", logRed, logNotRed);

// What if we just want a logging function, with a configurable output:

const logRed2 = function (message) {
  console.log(message);
};

const logNotRed2 = function () {
  console.log("It's NOT red!");
};

const redChecker2 = function (message, colour, isRedFunction, isNotRedFunction) {
  if (colour.toLowerCase() == "red"){
    isRedFunction(message);
  } else {
    isNotRedFunction();
  }
};

redChecker2("Printout message", "Red", logRed2, logNotRed2);
