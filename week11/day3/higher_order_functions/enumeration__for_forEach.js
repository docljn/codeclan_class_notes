const numbers = [1, 2, 3, 4, 5];

for (const number of numbers) {
  console.log("this number is", number);
}

// forEach does exactly the same as the for loop
// forEach doesn't return anything:
//    undefined return value [unlike .map and .filter]

numbers.forEach(function (number) {
  console.log("for each loop", number);
});

// write a function called `multiplyByTwo`that returns a new array with each element of the original array multiplied by 2

const multiplyByTwo = function (array) {
  const result = [];
  array.forEach(function (number) {
    const doubled = number * 2;
    result.push(doubled);
  } );
  return result;
};

console.log(multiplyByTwo(numbers));

// write a function called `getEvens` that returns a new array with all the even numbers from the original array

const getEvens = function (array) {
  const evens = [];
  array.forEach(function (number) {
    if (number % 2 === 0) {
      evens.push(number);
    }
  });
  return evens;
};

console.log(getEvens(numbers));

// write a function called `sumElements` that returns the sum total of all the elements of the original array

const sumElements = function (array) {
  let sum = 0;
  array.forEach(function (number) {
    sum += number;
  });
  return sum;
};

console.log(sumElements(numbers));
