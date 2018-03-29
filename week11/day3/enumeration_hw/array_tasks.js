const arrayTasks = {

  safeCheck: function (arr1) {
    // do something to check for null, undefined etc
    // return an error or a graceful fail
  },

  concat: function (arr1, arr2) {
    return arr1.concat(arr2);
  },

  insertAt: function (arr, itemToAdd, index) {
    arr.splice(index, 0, itemToAdd);
    return arr;
  },

  square: function (arr) {
    const newArray = arr.map( function (number) {
      return Math.pow(number, 2);
    });
    return newArray;
  },

  sum: function (arr) {
    return arr.reduce( function (runningTotal, currentItem) {
      return runningTotal + currentItem;
    }, 0);
  },

  removeAndClone: function (arr, valueToRemove) {
    const newArray = arr.filter( function (number) {
      return number !== valueToRemove;
    });
    return newArray;
  },

  findIndexesOf: function (arr, itemToFind) {
    const newArray = [];
    arr.forEach( function (number, index) {
      if (number === itemToFind){
        newArray.push(index);
      }
    });
    return newArray;
  },

  sumOfAllEvenNumbersSquared: function (arr) {
    return this.sum(this.square(arr.filter( function (number) {
      return number % 2 === 0;
    })));
  },

  // ----------- EXTENSION ------------

  findDuplicates: function (arr) {
    const duplicates = [];
    for (let i = 0; i < arr.length-1; i++) {
      const comparison = arr[i];
      if (arr.includes(comparison, i+1) && !duplicates.includes(comparison)) {
        duplicates.push(comparison);
      }
    }
    return duplicates;
  },

  // -----------GRAHAMS----------
  findDuplicatesGraham: function (arr) {
    const duplicates = arr.reduce(function(accumulator, currentItem, currentIndex, array) {
      if (array.indexOf(currentItem) !== currentIndex && accumulator.indexOf(currentItem) == -1) accumulator.push(currentItem); return accumulator;
    }, []);
    return duplicates.sort();
  },
  // array.indexOf(currentItem) !== currentIndex && accumulator.indexOf(currentItem) == -1
//**this is the tricky bit it checks whether the first index of the item matches the current index, if not its the second instance (duplicate)
// && if the accumulator doesn't already contain this push it to accumulator array.
};

module.exports = arrayTasks;
