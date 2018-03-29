/*global describe, it, beforeEach*/

const Park = require("../park");
const assert = require("assert");
const Dinosaur = require("../dinosaur");

let park;
let park_full;
let triceratops;
let velociraptor;
let velociraptor_2;
let tRex;
let tRex_2;
let tyrannosaurus;
let dilophosaurus;


describe("Park", function () {

  beforeEach(function () {
    park = new Park ();
    triceratops = new Dinosaur ("Triceratops", 10) ;
    velociraptor = new Dinosaur ("Velociraptor", 20) ;
    tRex = new Dinosaur ("TRex", 2) ;
    velociraptor_2 = new Dinosaur ("Velociraptor", 20) ;
    tRex_2 = new Dinosaur ("TRex", 2) ;
    park_full = new Park ();
    park_full.addDinosaur(triceratops);
    park_full.addDinosaur(velociraptor);
    park_full.addDinosaur(tRex);
    park_full.addDinosaur(velociraptor_2);
    park_full.addDinosaur(tRex_2);
    tyrannosaurus = new Dinosaur ("Tyrannosaurus", 3);
    dilophosaurus = new Dinosaur ("Dilophosaurus", 2);
  });

  it("should start with an empty enclosure", function () {
    const actual = park.getDinosaurCount();
    assert.strictEqual(actual, 0);
  });

  it("should be able to add a dinosaur", function () {
    park.addDinosaur(triceratops);
    const actual = park.getDinosaurCount();
    assert.strictEqual(actual, 1);
  });

  it("should be able to remove all dinosaurs of a particular type", function () {
    park_full.removeAllOfType("tRex");
    const expected = [triceratops, velociraptor, velociraptor_2];
    const actual = park_full.enclosure;
    assert.deepStrictEqual(actual, expected);
  });

  it("should be able to return a list of all the dinosaurs with an offspring count of more than 2", function () {
    const expected = [triceratops, velociraptor, velociraptor_2];
    const actual = park_full.getDinosaursByMinimumAnnualOffspringCount(3);
    assert.deepStrictEqual(actual, expected);
  });

  // TODO: extension
  //
  it("should be able to calculate number of dinosaurs after 1 year starting with 1 dinosaur", function () {
    park.addDinosaur(tyrannosaurus);  // assume tyrannosaurus has 3 offspring
    assert.strictEqual(park.calculateDinosaurs(1), 4);
  });

  it("should be able to calculate number of dinosaurs after 2 years starting with 1 dinosaur", function () {
    park.addDinosaur(tyrannosaurus);
    assert.strictEqual(park.calculateDinosaurs(2), 16);
  });

  it("should be able to calculate number of dinosaur after year two starting with 2 dinosaurs", function () {
    park.addDinosaur(tyrannosaurus);
    park.addDinosaur(dilophosaurus); // assume dilophosaurus has 2 offspring
    assert.strictEqual(park.calculateDinosaurs(2), 25);
  });

});
