const Bank = function () {
  this.accountBalances = [250, 250, 500, 500, 500];
  this.total = 0;
};

// a prototype method will be available to every instance of the Bank class
// here we see the pitfalls of the variable scope of "this":

Bank.prototype.updateTotal = function () {
  console.log("First this in updateTotal:",this);
  this.total = 0;

  this.accountBalances.forEach( function (accountBalance) {
    console.log("This inside forEach == global:", this == global);
    this.total += accountBalance;
  });
};

// the context of "this" is whatever is to the left of the method which is being called: i.e. what the method is being called on
// if that thing is an object, fine, but if not it ends up in global

const bank = new Bank();
console.log("Before without bind:", bank.total);
bank.updateTotal();
console.log("After without bind:", bank.total);


// Fixing "this" with bind:
Bank.prototype.updateTotalWithBind = function () {
  console.log("First this in updateTotal:",this);
  this.total = 0;

  this.accountBalances.forEach( function (accountBalance) {
    console.log("This inside forEach == global:", this == global);
    this.total += accountBalance;
  }.bind(this));
};

// bind is a method which returns a new version of our callback
// bind means we stel out of the callback function into the same space as the initial method call

const bank2 = new Bank();
console.log("\n Before with bind:", bank2.total);
bank2.updateTotalWithBind();
console.log("After with bind:", bank2.total);

// CARE: If you use an arrow function [ES6 notation] (x => x*2) the function calls bind automatically, and provides an implicit return
