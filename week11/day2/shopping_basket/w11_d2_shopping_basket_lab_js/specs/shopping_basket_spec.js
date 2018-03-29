const assert = require('assert');
const ShoppingBasket = require('../shopping_basket');
const Item = require('../item');

describe('shopping basket', function () {

  let shoppingBasket;
  let item;

  beforeEach(function () {
    shoppingBasket = new ShoppingBasket();
    item1 = new Item('beer', 2.00, false);
    item2 = new Item('gin', 12.00, true);
  });

  it('should have items', function () {
    assert.deepStrictEqual(shoppingBasket.items, []);
  });

  it('should start empty', function () {
    const actual = shoppingBasket.getItemCount();
    assert.strictEqual(actual, 0);
  });

  it('should be able to add an item', function () {
    shoppingBasket.addItem(item);
    const actual = shoppingBasket.getItemCount();
    assert.strictEqual(actual, 1);
  });

  it('should be able to remove an item', function(){
    shoppingBasket.addItem(item1);
    shoppingBasket.addItem(item2);
    shoppingBasket.removeItem(item1);
    const actual = shoppingBasket.items;
    assert.deepStrictEqual(actual, [item2]);
  })
  it('should be able to calculate total basket price', function(){
    shoppingBasket.addItem(item1);
    shoppingBasket.addItem(item2);
    assert.strictEqual(shoppingBasket.basketTotalPrice(), 14.00);

  })



})
