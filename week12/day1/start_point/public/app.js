console.log("Hello world!");
// called by HTML page, hence displays in the browser console on browser refresh

const lunch = {
  food: "hummus",
  drink: "coffee",
  time: "12.30"
};

console.log(lunch.time);

const wizard = {
  name: "Rincewind",
  cast: function () {
    return `${this.name} fails to cast the desired spell correctly`;
  }
};

console.log(wizard.cast());
