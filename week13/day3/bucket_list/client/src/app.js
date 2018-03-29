const appStart = function () {
  const url = "https://restcountries.eu/rest/v2";



  // get data from api
  makeRequest(url, requestComplete);

};

const render = function (arrayOfCountries) {
  populateSelectDropdown(arrayOfCountries);
  displayButton("Add Country");
  displayButton("Delete Bucket List");

  // displayBucketList will eventually take an argument provided by the database call....
  displayBucketList(arrayOfCountries);
};

const populateSelectDropdown = function (arrayOfCountries) {
  const dropdownDiv = document.querySelector("#dropdown");
  const select = document.createElement("select");
  select.class += " countries";
  dropdownDiv.appendChild(select);

  arrayOfCountries.forEach( function (countryObject, index) {
    countryObject.index = index;
    const option = document.createElement("option");
    option.value = index;
    option.text = countryObject.name;
    select.appendChild(option);
  });
};

const displayBucketList = function (arrayOfSelectedCountries) {
  const bucketDiv = document.querySelector("#bucket");
  const ul = document.createElement("ul");
  bucketDiv.appendChild(ul);

  arrayOfSelectedCountries.forEach( function (countryObject) {
    const li = document.createElement("li");
    li.innerText = countryObject.name;
    ul.appendChild(li);
  });
};

const displayButton = function (buttonName) {
  const controlDiv = document.querySelector("#control");
  const addButton = document.createElement("input");
  addButton.type = "button";
  addButton.name = buttonName;
  addButton.value = buttonName;
  controlDiv.appendChild(addButton);
};

const makeRequest = function (url, callback) {
  const request = new XMLHttpRequest();
  request.open("GET", url);
  request.addEventListener("load", callback);
  request.send();
};


const requestComplete = function () {
  if (this.status !== 200) return;
  const jsonString = this.responseText;
  const countries = JSON.parse(jsonString);
  // do something with countries so it's accessible to the rest of the page....
  render(countries);
};




window.addEventListener("load", console.log("HELLO"));

document.addEventListener("DOMContentLoaded", appStart);
