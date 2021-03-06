//NB: console.dir(image); gives the node representation
//NB: console.log(image); gives a simple text representation

const app = function () {

  const url = "https://api.punkapi.com/v2/beers";
  makeRequest(url, carryOutAPIRequest);


};

// get data from api (call in app, after DOMContentLoaded event)
const makeRequest = function (url, callback) {
  const request = new XMLHttpRequest();
  request.open("GET", url);
  request.addEventListener("load", callback);
  request.send();
};

const carryOutAPIRequest = function () {
  if(this.status !== 200) return;
  const jsonString = this.responseText;
  const beers = JSON.parse(jsonString);
  displayBeers(beers);
  displayDropDown(beers);
};

const displayDropDown = function (beersArray) {
  const dropDown = document.createElement("select");
  const dropDownDiv = document.getElementById("drop-down");
  console.dir(dropDownDiv);

  beersArray.forEach( function (beer) {
    const option = document.createElement("option");
    option.innerText = beer.name;
    option.value = beer.id;
    dropDown.appendChild(option);
  });
  dropDownDiv.appendChild(dropDown);

  // const handleDropDownChange = function () {
  //   const selectedBeerId = dropDown[this.value];
  //
  //
  // };
  //
  // dropDown.addEventListener("change", handleDropDownChange);
};



const makeBeerListing = function (beer) {
  const ulOuter = document.getElementById("beers-ul");
  ulOuter.className += " flex";

  const liOuter = document.createElement("li");
  liOuter.innerText = beer.name;
  liOuter.className += " beer_details";
  liOuter.id = beer.id;

  const ulInner = document.createElement("ul");
  const liInner = document.createElement("li");

  const beerImage = document.createElement("img");
  beerImage.src = beer.image_url;
  beerImage.setAttribute("height", 90);
  // could do beerImage.height = 90;
  beerImage.setAttribute("alt", "A picture of " + beer.name);

  const liInnerSecond = document.createElement("li");
  liInnerSecond.className += " ingredients";
  liInnerSecond.innerText = "Ingredients";

  const liInnerThird = document.createElement("li");
  liInnerThird.className += " malts";
  liInnerThird.className += " flex";
  liInnerThird.className += " flex-vertical";

  const divmalts = document.createElement("div");
  const divhops = document.createElement("div");
  const divyeast = document.createElement("div");

  const maltsListArray = beer.ingredients.malt;
  const maltsNamesArray = getNames(maltsListArray);
  const uniqueMalts = [...new Set(maltsNamesArray)];
  const maltsNamesList = uniqueMalts.join(", ");
  divmalts.innerText = "Malts: " + maltsNamesList;


  const hopsListArray = beer.ingredients.hops;
  const hopsNamesArray = getNames(hopsListArray);
  const uniqueHops = [...new Set(hopsNamesArray)];
  const hopsNamesList = uniqueHops.join(", ");
  divhops.innerText = "Hops: " + hopsNamesList;

  const yeastList = beer.ingredients.yeast;
  divyeast.innerText = "Yeast: " + yeastList;

  liInnerThird.appendChild(divmalts);
  liInnerThird.appendChild(divhops);
  liInnerThird.appendChild(divyeast);

  liInner.appendChild(beerImage);
  ulInner.appendChild(liInner);
  ulInner.appendChild(liInnerSecond);
  ulInner.appendChild(liInnerThird);

  liOuter.appendChild(ulInner);
  ulOuter.appendChild(liOuter);
};

const getNames = function (array) {
  let newArray = [];
  array.forEach( function (item) {
    newArray.push(item.name);
  });
  return newArray;
};

const displayBeers = function (beers) {
  beers.forEach(function (beer) {
    makeBeerListing(beer);
  });
};






document.addEventListener("DOMContentLoaded", app);
