var speak = function(firstName, lastName){
  return "Hi, I am " + firstName + " " + lastName;
}

console.log(speak("Jim", "Beam"));


var multiply = function(a,b){
  return a * b;
}

console.log(multiply(2,4));

var arrayFirstElement = function(array){
  return array[0];
}

console.log(arrayFirstElement([1,2,3,4,5]));


var animalNames = ["pig", "cow", "horse"];
var stockFarm = function(array){
  var farm = [];
  for (var animal of array){
    farm.unshift(animal);
    console.log(animal);
  }
  return farm;
}

console.log(stockFarm(animalNames));
