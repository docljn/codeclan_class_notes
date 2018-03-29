var guitars = [ 'fender', 'gibson', 'air' ];

console.log('guitars: ', guitars);

var drums = [];

var drums = new Array();

drums.push('gretsch');
drums.push('yamaha');
drums.push('tom tom');


console.log('drums: ', drums);

console.log(guitars[0]);

drums[1] = 'zildijan';
console.log('drums: ', drums);
console.log(drums[100]);

console.log(drums.length);


var fruits = ['Apple', 'Banana'];

console.log(fruits.length);
// 2

// Remove from the end of an Array
var last = fruits.pop(); // remove Orange (from the end)
// ["Apple", "Banana"];

// Remove from the front of an Array
var pos = fruits.indexOf('Banana');
// 1
var first = fruits.shift(); // remove Apple from the front
// ["Banana"];

// Remove an item by index position
var removedItem = fruits.splice(pos, 1); // this is how to remove an item
// ["Strawberry", "Mango"]

// Remove items from an index position
var vegetables = ['Cabbage', 'Turnip', 'Radish', 'Carrot'];
console.log(vegetables);
// ["Cabbage", "Turnip", "Radish", "Carrot"]

var pos = 1, n = 2;

var removedItems = vegetables.splice(pos, n);
// this is how to remove items, n defines the number of items to be removed,
// from that position(pos) onward to the end of array.

console.log(vegetables);
// ["Cabbage", "Carrot"] (the original array is changed)

console.log(removedItems);
// ["Turnip", "Radish"]
