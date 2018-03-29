const Taxi = function (manufacturer, model) {
  this.manufacturer = manufacturer;
  this.model = model;
  this.passengers = [];
};

Taxi.prototype.getPassengerCount = function () {
  return this.passengers.length;
};

Taxi.prototype.addPassenger = function (passenger) {
  this.passengers.push(passenger);
};

Taxi.prototype.empty = function () {
  this.passengers = [];
};

Taxi.prototype.removePassenger = function (passengerName) {
  for (passenger of this.passengers) {
    if (passenger.toLowerCase() == passengerName.toLowerCase()){
      const index = this.passengers.indexOf(passenger);
      this.passengers.splice(index, 1);
    }
  }
};

module.exports = Taxi;
