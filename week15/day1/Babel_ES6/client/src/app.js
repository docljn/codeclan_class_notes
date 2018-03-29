// var MakeupGetter = require('./MakeupGetterES6');

// new ES6 import:
import MakeupGetter from './MakeupGetterES6';

var app = function(){
  var mg = new MakeupGetter('maybelline');
  mg.fetchProducts();

  /* Explaining the implicit return from a fat arrow function
  const numbers = [1,2,3,4];
  const doubledNumbers = numbers.map( number => number * 2 );
  console.log(doubledNumbers);
 */

/* this won't work because a function body removes the implicit return
const numbers = [1,2,3,4];
const doubledNumbers = numbers.map( (number) => {
    number * 2 })
console.log(doubledNumbers);
*/

};

window.onload = app;
