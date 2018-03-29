const assert = require("assert");
const Taxi = require("../taxi");

// mocha provides a describe feature, a before-each function
let taxi;
// means the beforeEach is reassignment rather than a new global variable
// AVOID global variables like the plague

describe("Taxi", function () {

  beforeEach(function () {
    taxi = new Taxi("Toyota", "Prius");
    // can't call let taxi here as let is block scope
  });

  it("should have a manufacturer", function (){
    const actual = taxi.manufacturer;
    assert.strictEqual(actual, "Toyota");
  });
  it("should have a model", function () {
    const actual = taxi.model;
    assert.strictEqual(actual, "Prius");
  });

  // describing a subset of taxi
  describe("passengers", function () {
    it("should start with no passengers", function () {
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, []);
    });
    it("should return a passenger count", function () {
      const actual = taxi.getPassengerCount();
      assert.strictEqual(actual, 0);
    });
    it("should be able to accept a passenger", function () {
      taxi.addPassenger("passenger");
      const actual = taxi.getPassengerCount();
      assert.strictEqual(actual, 1);
    });
    it("should be able to remove all passengers", function () {
      taxi.addPassenger("passenger");
      taxi.addPassenger("passenger");
      taxi.empty();
      const actual = taxi.getPassengerCount();
      assert.strictEqual(actual, 0);
    });
    it("should be able to remove passengers by name", function () {
      taxi.addPassenger("passenger");
      taxi.addPassenger("pest");
      taxi.addPassenger("anotherPassenger");
      taxi.removePassenger("pest");
      const actual = taxi.getPassengerCount();
      assert.strictEqual(actual, 2);
    });
  });

});

// "TypeError: Taxi is not a constructor" USUALLY means you've forgotten to export the module you need
