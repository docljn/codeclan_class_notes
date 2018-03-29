var name = "Colin";
// scope is the whole file - i.e. global

var talk = function(){
  // var name = "Alex";
  // local function variables take precedence aka "shadowing"

  name = 'Alex'
  console.log("My name is " + name);
}

console.log("Trying to access name: " + name);
// Colin

var walk = function(){
  console.log(name + " is walking");
}
walk();
// Colin

talk(); // overwrites global variable, because we didn't specify var name in the function, and hence javascript creates a global variable
// Alex

walk();
// Alex

talk();
// Alex

console.log(global);  // BLEURGH - outputs entire context
