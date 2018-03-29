const assert = require('assert');
const Item = require('../item');

describe('Item', function () {

  let item;

  beforeEach(function () {
    item = new Item('beer', 2.00, false);
  })

  it('should have a name', function () {
    assert.strictEqual(item.name, 'beer');
  })

  it('should have a price', function(){
    assert.strictEqual(item.price, 2.00);
  })

  it('should have a bogof true or false set', function(){
    assert.strictEqual(item.bogof, false);
  })

})
