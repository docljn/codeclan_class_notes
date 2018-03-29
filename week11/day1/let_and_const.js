// older codebases use var: var has function scope
// modern js/es uses let and const: let has BLOCK scope

var mayIDrive = function(age){
  if(age >=17){
    var message = "You may drive!";
  } else {
    var message = "Too young, sorry";
  }
  console.log("Message: " + message);
}
mayIDrive(21);


// error: if you replace var with let (let has BLOCK scope) - fix by declaring inside the first set of braces i.e. block === function
var shouldIDrive = function(age){
  let message;
  if(age >=17){
    message = "You may drive!";
  } else {
    message = "Too young, sorry";
  }
  console.log("Message: " + message);
}
shouldIDrive(18);


// error: if you replace var with const you CANNOT REASSIGN it,
// const also has BLOCK SCOPE
// you CAN MUTATE the constant
const willIDrive = function(age){
  let message = "";
  if(age >=17){
    message = "You may drive!";
  } else {
    message = "Too young, sorry";
  }
  console.log("Message: " + message);
}
willIDrive(16);


// Rule of thumb:
  // use a CONST unless you absolutely have to reassign it
  // avoid using var 
