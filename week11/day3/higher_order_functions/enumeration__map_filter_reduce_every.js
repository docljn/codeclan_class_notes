const numbers = [1, 2, 3, 4, 5];



// write a function called `multiplyByTwo`that returns a new array with each element of the original array multiplied by 2:
// todo: refactor to use .map

const multiplyByTwo = function (array) {

  const newArray = array.map(function (number) {
    return number * 2;  // callback has to return the modified value for the new array
  } );
  return newArray;
};
console.log(multiplyByTwo(numbers));

// write a function called `getEvens` that returns a new array with all the even numbers from the original array: use filter
// var newArray = arr.filter(callback[, thisArg])

const getEvens = function (array) {
  const evens = array.filter(function (number) {
    return number % 2 === 0;
  });
  return evens;
};
console.log(getEvens(numbers));

// write a function called `sumElements` that returns the sum total of all the elements of the original array: use reduce
// [0, 1, 2, 3, 4].reduce(
//   function (
//     accumulator,
//     currentValue,
//     currentIndex,
//     array
//   ) {
//     return accumulator + currentValue;
//   }
// );


const sumElements = function (array) {
  const finalResult = array.reduce( function (runningTotal, currentNumber) {
    return runningTotal + currentNumber;
  }, 0);
  // CARE: if you don't provide a starting value, it will be set to the first element of the array which is to be reduced.
  return finalResult;
};

console.log(sumElements(numbers));

// Write a function to determine if every element in an array is greater than 10

// element is essential, index and array optional
const array1 = [12, 5, 8, 130, 44];
const array2 = [12, 54, 18, 130, 44];
function isBigEnough(element, index, array) {
  return element >= 10;
}
array1.every(isBigEnough);   // false
array2.every(isBigEnough); // true
