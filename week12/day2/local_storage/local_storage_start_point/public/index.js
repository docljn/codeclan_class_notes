const setDefinitionText = function (id, text) {
  const span = document.querySelector(id);
  span.innerText = text;
};

const getInputValue = function (id) {
  const input = document.querySelector(id);
  const value = input.value; //get the value of the selected item
  input.value = ""; //clear the value of the selected item
  return value; // return the ORIGINAL value
};

const handleButtonClick = function () {
  const name = getInputValue("#name");
  const species = getInputValue("#species");

  // create an object literal for the read information
  const pet = {
    name: name,
    species: species
  };

  // update the displayed information
  setDefinitionText("#name-display", pet.name);
  setDefinitionText("#species-display", pet.species);

  // store pet variable in "local storage"
  // if you just do localStorage.setItem("pet", pet); what is stored is "[object Object]" i.e. all data has been lost
  // use JSON to create a string representation of the object
  const jsonStringPet = JSON.stringify(pet);
  localStorage.setItem("pet", jsonStringPet);

};

const app = function () {
  const button = document.querySelector("button");
  button.addEventListener("click", handleButtonClick);

  const jsonStringPet = localStorage.getItem("pet");
  const savedPet = JSON.parse(jsonStringPet);

  setDefinitionText("#name-display", savedPet.name);
  setDefinitionText("#species-display", savedPet.species);
};

window.addEventListener("load", app);
