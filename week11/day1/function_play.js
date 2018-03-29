// function name(parameter){
//  function body;
//}

//name(argument) -> function call

// a method is attached to an object, or called on something.


function hello(){
  return ("Hello world!");
}

console.log("the return value is: ", hello());

// anything console logged cannot be tested, and does not return anything either.

// if you don't specify a return value, javascript returns "undefined"

function mood(name, mood){
  return name + ", you are " +mood;
}

console.log(mood("Lorna"));
// returns "Lorna, you are undefined"



function add(a,b){
  return a + b;
}

console.log(add(1,3));

console.log(add(1,3,5));  // ignores the last argument completely



function sum(){
  var sum = 0;
  for(var argument of arguments) {
    sum += argument;
  }
  return sum;
}

console.log(sum(1,2,3,4,5,6,7,8,9));



// variable as function:
  // this is an anonymous function, as it has no name after the 'function'...
// debugging anonymous functions is almost impossible, as the only info given is line number
var hello = function(){
  return "Hello world!";
}
// invoke the function just like any other function, but it can be passed around...
// in javascript, a function is an object
// means you can pass a function as an argument to another function
// the function will only be invoked when it is needed c.f. callbacks
console.log(hello());


// technically, this is also an anonymous function: a self-invoking function
// no control over when this is invoked
// potentially useful for avoiding name clashes, but YEUCH!
(function(){
  console.log("Hi");
})();

// passing a function as an argument:

var add = function(a,b){
  return a + b;
}

var wow = function(functionToInvoke){
  console.log(functionToInvoke(3,6));
}

wow(add);
