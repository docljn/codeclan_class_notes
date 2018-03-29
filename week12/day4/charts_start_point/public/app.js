
// new PieChart();
//
// const titleText = "Our Favourite Programming Languages";
// const seriesArray = [
//   {
//     name: "Cohort 7 Languages",
//     data: [8, 12, 3, 0, 1]
//   },
//   {
//     name: "Cohort 18 Languages",
//     data: [10, 10, 1, 1, 0]
//   }
// ];
//
// const xAxisCategoriesArray = ["JavaScript", "Java", "Ruby", "Python", "Algol"];
//
// new ColumnChart(titleText, seriesArray, xAxisCategoriesArray);

const app = function () {
  // Using Rest Countries API get information for a new chart:
  const url = "https://restcountries.eu/rest/v2/all";
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
  const countryList = JSON.parse(jsonString);



  const countryNames = countryList.map( function (country) {
    return country.name;
  });
  console.log(countryNames);

  const countryPopulations = countryList.map( function (country) {
    return Math.log(country.population);
  });

  const titleText = "Population Data: log scale";

  new ColumnChart(titleText, "Countries", countryPopulations, countryNames);
  //display
};
//
// const container = document.querySelector("#column-chart")
// const columnChart = new ColumnChart(container, countryData);
//
// console.log(countryData);




document.addEventListener("DOMContentLoaded", app);
