# JS Day 1 Homework

Go through each sample code and work out what the output will be and explain what happened.

### Episode 1
```js
var name = 'Keith';

var printName = function() {
  console.log('My name is ' + name );
};

printName();

```
- expected: 'My name is Keith' (declared outside the function and hence available within the function)

### Episode 2
```js
score = 5;

var result = function() {
  var score = 3;
  return score;
};

console.log(result());

```
- expected: 3 (local takes precedence over global)

### Episode 3
```js
var myAnimals = ['Chickens', 'Cats', 'Rabbits'];

var listAnimals = function() {
  myAnimals = ['Ducks', 'Dogs', 'Lions'];
  for(var i=0;i<myAnimals.length; i++){
    console.log(i + ": " + myAnimals[i]);
  }
}

listAnimals();
```
- expected:

  0: Ducks

  1: Dogs

  2: Lions

- because the myAnimals within the function isn't declared as var/let then the scope is global and it overwrites the initial myAnimals array.
- the overwrite only happens when the function is called

### Episode 4

```js
var suspectOne = 'Jay';
var suspectTwo = 'Val';
var suspectThree = 'Keith';
var suspectFour = 'Rick';

var allSuspects = function() {
  var suspectThree = 'Harvey'
  console.log('Suspects include: ' + suspectOne + ', ' + suspectTwo + ', ' + suspectThree + ', ' + suspectFour)
};

allSuspects();
console.log( 'Suspect three is:' + suspectThree );
```
- expected 1: Suspects include: Jay, Val, Harvey, Rick
- expected 2: Suspect three is: Keith


### Episode 5

```js
var detective = {
  name : 'Ace Ventura',
  pet : 'monkey'
};

var printName = function(detective) {
  return detective.name
};

var detectiveInfo = function() {
  detective['name'] = 'Poirot'
  return printName(detective);
};

console.log(detectiveInfo());
```
- expected: 'Poirot'

### Episode 6
```js
var murderer = 'rick';

var outerFunction = function() {
  var murderer = 'marc';

  var innerFunction = function() {
    murderer = 'valerie';
  }

  innerFunction();
}

outerFunction();
console.log('the murderer is ', murderer);
```
- expected: the murderer is valerie because inner function overwrites global variable...
- WRONG: why?

  - because the scope of valerie is inside the outer function, and although it is "global" inside the inner function it is still scoped to within the outer function *because* there is a variable of that name in the outer function
  - it therefore does NOT affect the overall global murderer variable
  - ** So, it turns out that javascript only creates a global variable if there isn't a variable of that name in scope **
  - if the 'marc' line was absent, then valerie would overwrite rick

### Episode 7 - Make up your own episode/s!

Make up your own episode which can be whatever you wish and the rest of the class will work out together what happened and what the output will be.
