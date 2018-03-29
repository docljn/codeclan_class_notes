const Park = function() {
  this.enclosure = new Array;
};

Park.prototype.getDinosaurCount = function () {
  return this.enclosure.length;
};

Park.prototype.addDinosaur = function (dinosaur) {
  this.enclosure.push(dinosaur);
};

Park.prototype.removeAllOfType = function (type) {
  const remainingDinosaurs = [];
  for (const dinosaur of this.enclosure) {
    if (dinosaur.type.toLowerCase() !== type.toLowerCase()) {
      const index_to_keep = this.enclosure.indexOf(dinosaur);
      remainingDinosaurs.push(this.enclosure[index_to_keep]);
    }
  }
  this.enclosure = remainingDinosaurs;
};

Park.prototype.getDinosaursByMinimumAnnualOffspringCount = function (minimumNumber) {
  let dinosaur_collection = [];
  for (const dinosaur of this.enclosure) {
    if (dinosaur.annual_offspring >= minimumNumber) {
      dinosaur_collection.push(dinosaur);
    }
  }
  return dinosaur_collection;
};

Park.prototype.breedingResult = function (dinosaur) {
  return 1 + dinosaur.annual_offspring;
};

Park.prototype.calculateDinosaurs = function (numberOfYears) {
  let dinosaurCount = 0;
  for (const dinosaur of this.enclosure) {
    dinosaurCount += Math.pow(this.breedingResult(dinosaur), numberOfYears);
    // for each year, the number of dinosaurs is increased by the number of dinosaurs * offspring, repeating
  }
  return dinosaurCount;
};



module.exports = Park;
