const ShoppingBasket = function () {
  this.items = [];
}
ShoppingBasket.prototype.getItemCount = function(){
  return this.items.length;
}

ShoppingBasket.prototype.addItem = function (item) {
  this.items.push(item);
}

ShoppingBasket.prototype.removeItem = function (item) {
  const index = this.items.indexOf(item);
  this.items.splice(index, 1);
}

ShoppingBasket.prototype.basketTotalPrice = function () {
  let basketPrice = 0;
  for (item of this.items){
    basketPrice += item.price;
  }
  return basketPrice;
}

module.exports = ShoppingBasket;
