var Bank = function() {
  this.accounts = [];
};

Bank.prototype.addAccount = function (account) {
  this.accounts.push(account);
};

Bank.prototype.accountByName = function (accountHolderName) {
  const accountsSelected = this.accounts.filter( function (account) {
    return account.name === accountHolderName;
  });
  return accountsSelected;
};

Bank.prototype.payInterest = function (){
  const accountsAfterInterestPaid = this.accounts.map(function(account){
    account.value *= 1.1;
    return account;
  });
  return accountsAfterInterestPaid;
};

Bank.prototype.businessAccounts = function (){
  const businessAccounts = this.accounts.filter(function (account){
    return account.type === "business";
  });
  return businessAccounts;
};

Bank.prototype.totalValue = function () {
  const totalValue = this.accounts.reduce(function(runningTotal, account){
    return runningTotal + account.value;
  }, 0);
  return totalValue;
};

Bank.prototype.averageValue = function () {
  const average = this.totalValue()/this.accounts.length;
  return average;
};

Bank.prototype.largestAccount = function () {
  const valuesArray = this.accounts.map(function(account){
    return account.value;
  });
  const maxValue = Math.max.apply(Math, valuesArray);
  const maxAccountArray = this.accounts.filter(function(account){
    return account.value === maxValue;
  });
  return maxAccountArray;
};


module.exports = Bank;
