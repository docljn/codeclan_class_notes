var app = function(){
  const countriesUrl = "https://restcountries.eu/rest/v2/all";
  // makeRequest(countriesUrl, requestComplete);
  const button = document.getElementById("get-countries");
  const getCountriesButtonClicked = function () {
    makeRequest(countriesUrl, requestComplete);
    button.hidden = true;
  };
  button.addEventListener("click", getCountriesButtonClicked);

};

const makeRequest = function (url, callback) {
  // new object using built-in javascript constructor
  const request = new XMLHttpRequest();
  // open url: (type of request e.g. post, get, put, delete, url)
  request.open("GET", url);
  // evoke callback after event is complete i.e. add an eventlistener
  request.addEventListener("load", callback);
  // actually send the request and start the process, which results in "load" event, which then invokes the callback!
  request.send();
};

const requestComplete = function () {
  // requestComplete is called from within request.addEventListener
  // "this" inside requestComplete is the requestObject "request"
  if (this.status !== 200) return;  // bouncer pattern
  // capture the return result of the request as a variable
  const jsonString = this.responseText;
  const countriesArray = JSON.parse(jsonString);
  // you DON'T want the requestComplete to do more than one thing, so you need a way to access the information which has resulted from your request
  populateList(countriesArray);
};

const populateList = function (arrayOfCountries) {
  // get the ul already existing on the index page
  const ul = document.getElementById("country-list"); // querySelector is slower but more precisely configurable

  arrayOfCountries.forEach( function (country) {
    const li = document.createElement("li");
    li.innerText = country.name;
    ul.appendChild(li);
  }); // forEach doesn't return anything, and we don't need a return value
};



// call app once the basic structure of the webpage has loaded
document.addEventListener("DOMContentLoaded", app);
